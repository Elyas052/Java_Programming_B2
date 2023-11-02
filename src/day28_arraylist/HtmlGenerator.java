package day28_arraylist;

public class HtmlGenerator {
    /*
        input: div^3
        output: <div></div> <div></div> <div></div>
     */
    public static void main(String[] args) {

        // I am calling htmlGenerator method and passing a single String argument.
        System.out.println(htmlGenerator("div^3"));
        System.out.println(htmlGenerator("script^4"));
    }

    //div^3
    // This method accepts one parameter which is String.
    public static String htmlGenerator(String str) {

        String result = "";
        String[] parts = str.split("\\^");  // This is used for reg ex - > so, we need to use forward slash.
        // ["div", "3"]
        //    0     1

        // We're Converting and Assigned int (Primitive data type) to Integer (Non-primitive data type).
        int num = Integer.parseInt(parts[1]);  // 3
        for (int i = 0; i < num; i++) {
            result += "<" + parts[0] + "></" + parts[0] + ">";
        }
        return result;
    }
}
