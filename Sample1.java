class Weather{
    int month=1;
    int day=26;
    String sky="°‚ê";

}

class Sample1{
    public static void main(String[]args){
        Weather today = new Weather();
        //today.month = 5;
        //today.day = 13;
        //today.sky = "°‚ê";
        System.out.println(today.month + "Œ" + today.day + "“ú" + today.sky);
    }
}