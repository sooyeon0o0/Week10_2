import java.util.Scanner;
// 사칙연산을 수행하는 메소드(add, subtract, multiply, divide)를 구현 해서 실제 작동하는 계산기 만들기
// 메소드 -> void 함수

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc = 클래스, System.in = 매개변수

        String operator;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        float num1 = sc.nextFloat();

        while(true){
            System.out.print("연산자를 입력하세요(종료:0): ");
            operator = sc.next();

            if (operator.equals("0")){
                System.out.println("종료합니다.");
                break;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            float num2 = sc.nextFloat();

            Cal copy = new Cal(num1, num2, operator);
            // 클래스 안에 있는 생성자에 매개변수로 num1, num2를 복사 후 넣기
            // Cal = 객체 이름 , cal = 인스터스 이름(정의 하는 이름),, cal은 밑에 class Cal의 복제체 (다른 애들임)
            // class를 통해 cal이라는 인스턴스를 복제하고 생성자로 넣어 매개변수 초기화

            if (operator.equals("+")){
                copy.add();
            }
            else if (operator.equals("-")){
                copy.subtract();
            }
            else if (operator.equals("*")){
                copy.multiply();
            }
            else if (operator.equals("/")){
                copy.divide();
            }
            else{
                System.out.println("다시 입력하세요.");
            }

            num1 = copy.result;

        }
    }
}

class Cal{
    float num1;
    float num2;
    String operator;
    float result;

    // 생성자 초기화
    Cal(float num1, float num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
        // 틀생성
    }

    // 반환값이 void, 반복을 하고 싶으면 값을 반환해서 메인에서 하기
    // 반환값이 void면 반환을 X
    void add(){
        result = num1 + num2;
        System.out.println(result);
    }

    void subtract(){
        result = num1 - num2;
        System.out.println(result);
    }

    void multiply(){
        result = num1 * num2;
        System.out.println(result);
    }

    void divide(){
        result = num1 / num2;
        System.out.println(result);
    }
}