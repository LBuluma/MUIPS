
package data;

import Case.Case;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author justus
 */
public class CaseSearch {

    private static List<Case> filteredList;

    //Filter out the Constituency
    public static List filterCons(String cons, List<Case> list) {

        filteredList = list.stream()
                .filter((Case x) -> {
                    return cons.equals(x.getCase_id());//Change to getConstituency();
                })
                .collect(Collectors.toList());
        return filteredList;
    }

    //Filter out the ward
    public static List filterWard(String ward, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return ward.equals(x.getCase_id());// change to getWard()
                })
                .collect(Collectors.toList());
        return filteredList;
    }

      //Filter out the gender
    public static List filterGender(String gender, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return gender.equals(x.getGender());
                })
                .collect(Collectors.toList());
        return filteredList;
    }

    //Filter out the color
    public static List filterColor(String color, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return color.equals(x.getCase_id());//change to person color
                })
                .collect(Collectors.toList());
        return filteredList;
    }

     //Filter out the height
    public static List filterHeight(String height, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return height.equals(x.getCase_id());//change to person height
                })
                .collect(Collectors.toList());
        return filteredList;
    }

     //Filter out the weight
    public static List filterWeight(String weight, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return weight.equals(x.getCase_id());//change to person weight
                })
                .collect(Collectors.toList());
        return filteredList;
    }

    
       //Filter out the hColor
    public static List filterHcolor(String hColor, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return hColor.equals(x.getCase_id());//change to person hColor
                })
                .collect(Collectors.toList());
        return filteredList;
    }

    
     //Filter out the feature
    public static List filterFeature(String feature, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return feature.equals(x.getCase_id());//change to person hColor
                })
                .collect(Collectors.toList());
        return filteredList;
    }
    
    //Filter out the Date 
    public static List filterDate(String minDate, String maxDate, List<Case> list) {

        filteredList = list.stream()
                .filter(x -> {
                    return minDate.equals(x.getCase_id());//change to compare the two dates
                })
                .collect(Collectors.toList());
        return filteredList;
    }
    
    

}
