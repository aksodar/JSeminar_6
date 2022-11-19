package ru.gb.jseminar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.gb.jseminar.data.Notebook;

class HomeworkTest {

    @Test
    void getCountFonesSuccessful (){
        
        List<Notebook> listNotebooks = new ArrayList<Notebook>( 
            Arrays.asList(
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'b'),
            new Notebook(18, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'b')));
        
        Map<String, String> filteringСriteria = new HashMap<>();
        filteringСriteria.put("disgonal", "16");
        filteringСriteria.put("operatingSystem",  "Windows");
        filteringСriteria.put("condition", "g" );

            
        List<Notebook> expected= new ArrayList<Notebook>(Arrays.asList(new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'g')));
               
       
        Homework homework = new Homework();
        List<Notebook>actual = homework.filter(filteringСriteria, listNotebooks);

        Assertions.assertEquals(expected,actual);
          
    }

    @Test
    void getCountFonesEmpty (){
        List<Notebook> listNotebooks = new ArrayList<Notebook>( 
            Arrays.asList(
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'b'),
            new Notebook(18, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'b')));
        
        
        Map<String, String> filteringСriteria = new HashMap<>();
        filteringСriteria.put("disgonal", "16");
        filteringСriteria.put("operatingSystem",  "Windows");
        filteringСriteria.put("condition", "g" );
                     
       
        Homework homework = new Homework();
        List<Notebook>actual = homework.filter(filteringСriteria, listNotebooks);

       
             
        Assertions.assertNotEquals(Collections.EMPTY_LIST, actual);
          
    }

}