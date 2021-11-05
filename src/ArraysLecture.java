import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // js
        // let numbers = [1, 2, 3, 4, 5, "hello", "world"];
        // numbers.push(6);
        // numbers.pop();
        // console.log(numbers); // [1, 2, 3, 4, 5]

        // Java
        // declare a variable
        // dataType variableName = ...
//        String[] strings = {}; // length = 0
//        strings[0] = "hello"; // Index 0 out of bounds for length 0
//        System.out.println("strings[0] = " + strings[0]);

        String[] names = {"Destiney", "Shanshan"};  // length = 2
        System.out.println("names[0] = " + names[0]);
        System.out.println("names[1] = " + names[1]);

        Person shan = new Person("Shanshan");
        System.out.println("shan.getName() = " + shan.getName());
        shan.setName("Destiney");
        System.out.println("shan.getName() = " + shan.getName());


        String[] names2 = new String[3];
        names2[0] = "Justin";
        names2[1] = "Destiney";
        names2[2] = "Shanshan";
        System.out.println("names2[0] = " + names2[0]);

        names2[0] = "Kenneth";
        System.out.println("names2[0] = " + names2[0]);

        // {"Kenneth", "Destiney", "Shanshan"}
        System.out.println("names2 = " + names2);
        System.out.println("Arrays.toString(names2) = " + Arrays.toString(names2));

        int[] integers = {1, 2, 3, 4, 5};
        System.out.println("integers = " + integers);
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        String[] names3 = {"Kenneth", "Destiney", "Shanshan"};

//        System.out.println("names2 == names3 = " + names2 == names3); // incomparable types: java.lang.String and java.lang.String[]

        System.out.println("Arrays.equals(names2, names3) = " + Arrays.equals(names2, names3));
        System.out.println("names2 = " + names2);
        System.out.println("names3 = " + names3);

        Arrays.fill(names3, "Douglas");
        System.out.println("Arrays.toString(names3) = " + Arrays.toString(names3));
        Arrays.fill(names3, 0, 2, "Destiney");
        System.out.println("Arrays.toString(names3) = " + Arrays.toString(names3));

        // js array.push()
        String[] names4 = Arrays.copyOf(names2, names2.length + 1);
        System.out.println("Arrays.toString(names4) = " + Arrays.toString(names4));

        names4[names4.length - 1] = "Douglas";
        System.out.println("Arrays.toString(names4) = " + Arrays.toString(names4));

        String[] names5 = pushAName(names2, "Alex");
        System.out.println("Arrays.toString(names5) = " + Arrays.toString(names5));


        int[] numbers = {1, 6, -4, 9, 7, 16, -25};
        System.out.println("Arrays.binarySearch(numbers, 9) = " + Arrays.binarySearch(numbers, 9));

        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        Arrays.sort(names5);
        System.out.println("Arrays.toString(names5) = " + Arrays.toString(names5));

        // like js indexOf()
        System.out.println("Arrays.binarySearch(numbers, 9) = " + Arrays.binarySearch(numbers, 9));
    }

    // function push(strings, string){}
    public static String[] pushAName(String[] names, String name) {
        String[] newStrings = Arrays.copyOf(names, names.length + 1);
        newStrings[newStrings.length - 1] = name;

        return newStrings;
    }
}
