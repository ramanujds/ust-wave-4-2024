package strings;

public class StringBasics {

    public static void main(String[] args) {

//        String firstName = "Sachin";
//        String lastName = "Thomas";
//
//        String fullName = firstName+" "+lastName;
//        System.out.println(fullName);
//
//      //  System.out.println("Short Form : "+firstName.charAt(0)+" "+lastName.charAt(0));
//
//        System.out.println(fullName.indexOf(" "));
//
//        System.out.println(firstName.equals("sachin"));

        String []names = {"Sachin Thomas","Andrea A Sen","Sai Karthik", "Rogan Raj"};


        // update all the names to uppercase

        String []namesInUpper = new String[names.length];

        for (int i=0; i<names.length; i++){
            namesInUpper[i] = names[i].toUpperCase();
        }

        for (String str:namesInUpper){
            System.out.println(str);
        }


        // Get the short form for each name - Rogan Raj -> Rogan R
        // Sachin T


    }

}
