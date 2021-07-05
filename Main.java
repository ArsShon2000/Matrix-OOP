package Matrix;
public class Main {
    public static void main(String [] args) {
        try {
            Matrix1 mat1 = new Matrix1(2, 2);
            Matrix1 mat2 = new Matrix1(2, 2);

            mat1.output();
//            m2.output();
//            Matrix1 c = m1.plus(m2);
//            Matrix1 c = m1.plus(m1).plus(m1);
//            c.output();
//            Matrix1.plus(m1,m2).output();
            Matrix1.plus(mat1,mat1).plus(mat1).output();
//            Matrix1 p = m1.mult(2);
//            p.output();
//            Matrix1 r = m2.mult(2);
//            r.output();
            Matrix1.mult(mat1,2).output();
            mat1.mult(3).output();
//            Matrix1.mult(m2,2).output();
            Matrix1.mult(mat1,mat1).output();
        }
        catch (Exception e){
            System.out.print("Error: " + e);
        }



    }
}
