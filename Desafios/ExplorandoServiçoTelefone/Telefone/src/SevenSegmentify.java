public class SevenSegmentify {
    public static String sevenSegmentify(String time) {
      String[][] segments = {
            {" _ ", "| |", "|_|"}, // 0
            {"   ", "  |", "  |"}, // 1
            {" _ ", " _|", "|_ "}, // 2
            {" _ ", " _|", " _|"}, // 3
            {"   ", "|_|", "  |"}, // 4
            {" _ ", "|_ ", " _|"}, // 5
            {" _ ", "|_ ", "|_|"}, // 6
            {" _ ", "  |", "  |"}, // 7
            {" _ ", "|_|", "|_|"}, // 8
            {" _ ", "|_|", " _|"},  // 9
            {"   ", " . ", " . "} // :
        };
      String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) { // Iterar por cada linha do display
           for (char digit : (hours > 9 ? String.valueOf(hours) : " " + hours + minutes).toCharArray()) {
               result.append(segments[Character.getNumericValue(digit)][i]);
           }
           result.append("\n");
        }
        return result.toString();
    }
}