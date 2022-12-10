package org.example.abstractfactory;

public class FactoryProvider {
    public static AbstractGardenCreator getFactory(String choice){

        if("Iranian".equalsIgnoreCase(choice)){
            return new IranianGardenCreator();
        }
        else if("Japanese".equalsIgnoreCase(choice)){
            return new JapaneseGardenCreator();
        }

        return null;
    }
}
