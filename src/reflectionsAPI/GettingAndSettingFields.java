package reflectionsAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by f.taleb on 7/3/2017.
 */
public class GettingAndSettingFields {
    private  static String NAME = "Farzaneh" ;
    /*Reflection is useful when it is properly used for right purpose.
    By using reflection, you can access private variables and re-initialize final variables.*/

    /*In normal scenario, private variables can't be accessed outside of declared class ( without getter and setter methods).
    final variables can't be re-assigned after initialization.*/
public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
      /*  Using the Reflection API, it is possible to change or get the value of a field at runtime.
    For example, you could use it in an API to retrieve different fields based on a factor, like the OS.
    You can also remove modifiers like final to allow modifing fields that are final.*/

    // Get the field in class SomeClass "NAME".
    Field nameField = GettingAndSettingFields.class.getDeclaredField("NAME");

    // Get the field in class Field "modifiers". Note that it does not
// need to be static
    Field modifiersField = Field.class.getDeclaredField("modifiers");

// Allow access from anyone even if it's declared private
    modifiersField.setAccessible(true);

    // Get the modifiers on the "NAME" field as an int.
    int existingModifiersOnNameField = nameField.getModifiers();

    // Bitwise AND NOT Modifier.FINAL (16) on the existing modifiers
// Readup here https://en.wikipedia.org/wiki/Bitwise_operations_in_C
// if you're unsure what bitwise operations are.
    int newModifiersOnNameField = existingModifiersOnNameField & ~Modifier.FINAL;



// Set the value of the modifiers field under an object for non-static fields
    modifiersField.setInt(nameField, newModifiersOnNameField);

// Set it to be accessible. This overrides normal Java
// private/protected/package/etc access control checks.
    nameField.setAccessible(true);

    // Set the value of "NAME" here. Note the null argument.
    // Pass null when modifying static fields, as there is no instance object
    nameField.set(null, "Hacked by reflection...");

// Here I can directly access it. If needed, use reflection to get it. (Below)
    System.out.println(GettingAndSettingFields.NAME);
}

    /*You can obtain Constructor class from the Class object .*/
  /*  Using reflection, a method of an object can be invoked during runtime.*/

    /*So we could examine enum classes with Reflection like any other class.
    But the Reflection API offers three enum-specific methods.*/

  /*  Given a String containing the name of a class, it's Class object can be accessed using Class.forName*/


   /* Keep in mind that reflection might decrease performance, only use it when your task cannot be completed without reflection.*/


}

