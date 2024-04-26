package main.java.com.ohgiraffers.section01.extend;

import com.ohgiraffers.section01.extend.FireCar;

public class Application01
{

    public static void main(String[] args)
    {
        /*
        * 상속
        * 상속(interitance)은 현실 세계의 상속과 비슷한 개념이다.
        * 부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미이다.
        * 클래스 또한 부모클래스와 자식클래스로 역할을 나누어서 부모가 가지는 멤버를 자식이 물려받아
        * 자기의 멤버인 것 처럼 사용할 수 있도록 만든 기술이다.
        *
        * 하지만 단순 물려받는 개념보다는 조금 더나아간다면
        * 자바에서의 상속은 부모클래스의 확장(extend)의 개념을 가진다.
        * 물려받아서 자신의 것 처러 ㅁ사용하는 것뿐 아니라 추가적인 멤버도 작서이 가능하다.
        * 특히 메소드 재정의(Overriding)라는 기술을 이용해서 부모가 가진 메소드를 재저의하는 것도 가능하다.
        *
        * 메소드 재정의(overrriding)이란 무고가 가지는 메소드 선언부를 그대로 사용하며넛
        * 자식클래스가 정의한 메스대로 동작하도록 구현 몸체 부부능ㄹ 새롭게 다시 작성하는 기술이다.
        * 메소드 재정의를 하면 메속드르 호출할 시 재정의한 메소드가 우선으로 동작한ㄱ세 된가.
        *
        * 이러한 상송이라는 기술을 사요하게 되면 얻게되는 이점을 크게 두가깆로 보룻있다.
        * 1.새로운 클래스를 작성할 시기존에 작성한 클래스를 재사용할 수 있다.
        * 1-1.재사용시 생산성을 크게 샹항시킬 수 있다.(새롭게 작성하는 것보다 ㅃ짜른다.ㅖ)
        * 1-2.공통적으로 사용하는 코드가 부코클래스에 존재하면 수정사하이 생길 시 무노큵래스만 수정해도 전체적으로 적용된다9유지보성증가0
        * 2.클래스간의 계층관계가 형성되며 다형서의 문법적인 토대라 된다.
        *
        * 하지만 상혹으로 인핟ㄴ점도ㅗ 존재한다
        * 1. 부코클래스의 기능을 추가/변경할 시 자식 클르ㅐ스가 정상적으로 동하는지에 대힌 예측이 힘들다
        * 상송 구조가 복자해 질 수록 그 영해ㅑ에 대한 예층이 힘들며 이러한 단점이 유집수성 증가하는 장점과는 반대로 유지보수에
        * 악영햐으 미치낟.
        * 2. 또한 부모클래스의 면경 또한 쉽않ㅈ다.자식클래스에서 중요하게 사용하느 긴응인 겨우
        * 부모클래스를 변경할 시 자식 클래스에 모두 영향을 줄수 이쌈
        * 역시 유지보수에 약여향을 미친다.
        * 3.부모클래스에는의미있었던 기능이 자식클래스에어 무의맣ㄹ 시있다.
        *
        * 장점과 단점을 고려했을 떄,
        * 상속은 재상요리라른 장점만 바라보게 되면 오용의 가능성이 있기 떄문에 유지보수에 좋안 ㅎ코드르 자성하ㄹ확률이 높다.
        * 상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.
        *
        * 객체지향 설계관점에서 바라보는 상속
        * 모든 객체는 자신이 수신한 메세지에 대해 응답을 해야 하는 책임을 가지며, 그책임의 규모는 적절해야 한다.
        * 적절한 책임을 가진 객체들이 서로협력(ㅁ-ㅅ-지 수신과 응담)을 통해 프로그램이 동작하느 것이
        * 객체지향 프로그램이다.
        *
        * 적절한 책임을 수행하는 객체 또한 그 객체만 수행할 수 있는 ㅣㄱ능이라기 보다 역할의 관점으로 바라봐야한다.
        * 역할이란 동일한 동작을 수해아느 것을 정의한 것이며,대체 가능성을 의미한다.
        * 부모클래스를 추상하느 경우에는 역할의 관점으로 바라봐야한다.
        * 그래야 작식클래스로 생성한 객체들이 서로 역할을 수행해가며 유연한 코드를 작성할 수 있게 된다.
        * 동일한 역할을 가지는 모든 개체느 ㄴ동일한 메세지를 수신하기는 하지만,
        * 객체별로 그메세지에 응답하느납ㅇ식은 ㅓㅅ로 다를 수있다.(다향성)
        * */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();


        System.out.println("================");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWarter();

        System.out.println("---------");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.stop();
        racingCar.soundHorn();




    }
}
