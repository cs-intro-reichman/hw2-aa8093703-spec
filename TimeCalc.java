public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        String hourAsString = ("" + args[0].charAt(0) + args[0].charAt(1));
        int hour = Integer.parseInt(hourAsString);

        String minutesAsString  = ("" + args[0].charAt(3) + args[0].charAt(4));
        int minutes = Integer.parseInt(minutesAsString);

        int totalminutes1 = hour * 60 + minutes;

        int totalminutes2 = totalminutes1 + minutesToAdd;

        int finalHours = (totalminutes2 / 60) % 24;
        int finalminutes = totalminutes2 % 60;

        if (finalHours > 9 && finalminutes > 9) {System.out.println(finalHours + ":" + finalminutes);
            
        } else if (finalHours < 9 && finalminutes > 9) {System.out.println("0" + finalHours + ":" + finalminutes);
            
        } else System.out.println("0" + finalHours + ":" + "0" + finalminutes);
        
        
    }
}
