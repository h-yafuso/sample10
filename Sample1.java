class Weather{
    int month=1;
    int day=26;
    String sky="����";

}

class Sample1{
    public static void main(String[]args){
        Weather today = new Weather();
        //today.month = 5;
        //today.day = 13;
        //today.sky = "����";
        System.out.println(today.month + "��" + today.day + "��" + today.sky);
    }
}