public class Student implements Comparable <Student>{
    private  String ten;
    private  Integer tuoi;
    private  String diachi;
    public Student (String ten, Integer tuoi, String diachi){
        this.ten=ten;
        this.tuoi=tuoi;
        this.diachi=diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    @Override
    public String toString(){
        return "Học sinh tên là :"+ ten;
    }
    @Override
    public  int compareTo(Student student) {
    return this.getTen().compareTo(student.getTen());
    }
}





