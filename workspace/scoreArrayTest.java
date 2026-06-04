// 국어, 영어, 수학 점수를 이용해서 총점과 평균을 계산
public class scoreArrayTest {
        public static void main(String[] args){

            int[] haruScore = new int[3]; // 1. 배열 선언과 생성을 동시에
            int kor = 100; // 국어 점수
            int eng = 90; // 영어점수
            int math = 85; // 수학점수

            int sum = kor + eng + math; // 총점
            double avg = sum / 3.0; // 평균, 91.6666
//                avg = Math.round(avg); // 소수 첫째자리 반올림, 92
//                avg = Math.round(avg * 10) / 10.0; // 소수 둘째자리 반올림, 91.7
            avg = Math.round(avg * 100) / 100.0; // 소수 세쨰자리 반올림, 91.67

            System.out.println("총점: " + sum);
            System.out.println("평균: " + avg);
}   }   }

