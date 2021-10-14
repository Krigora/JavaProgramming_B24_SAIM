package office_hours.practice_10_14_2021;

/*
    Sort Letters and Numbers from alphanumeric String
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     sort the individual string and append them back together
     Input: "DC501GCCCA098911"
     OutPut: "CD015ACCCG011899"


     CD015

     how do we find the substrings

        current char letter ? is next one (i + 1) letter? -> good
        current char letter ? is next one (i + 1) is NOT a letter? -> we found the substring

        current char digit? is next one (i + 1) digit -> good
        current char digit? is next one (i + 1) is not a digit -> we found a substring

        when we are on the last letter length - 1
        force the action to happen  -> assuming the last character is part of the substring

     actions:

        sort this substring
        assign sorted substring to final string
        reset current substring to be empty

 */


public class SortEachLetterAndDigit {


}


