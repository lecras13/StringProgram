package com.epam.task5.logic.launch;

import com.epam.task5.data.DataAcquirer;
import com.epam.task5.data.DataFactory;
import com.epam.task5.data.enums.DataType;
import com.epam.task5.entity.Text;
import com.epam.task5.logic.addparameters.ParametersForStartByConsole;
import com.epam.task5.logic.placeholder.CharacterPlaceholderByStringMethod;
import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.ResultPrinter;
import com.epam.task5.view.enums.PrintType;

public class ConsoleRun {
    public static void runFromConsole(DataFactory dataFactory){
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        Text text = console.getText();

        //getting parameters fo start
        ParametersForStartByConsole parameterForStart = new ParametersForStartByConsole();
        String[] parametes = parameterForStart.getParameters();

        //changing by string method
        //CharacterPlaceholderByStringMethod characterPlaceholderByStringMethod = new CharacterPlaceholderByStringMethod();
        //Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);

        //changing by Char method
        CharacterPlaceholderByStringMethod characterPlaceholderByStringMethod = new CharacterPlaceholderByStringMethod();
        Text newRedaction = characterPlaceholderByStringMethod.changeCharacter(text, parametes);
        //print after
        print(PrintType.CONSOLEPRINTER, newRedaction.toString());
    }

    private static void print(PrintType type, String result){
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
