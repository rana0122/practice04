package prob05;

public class MyBase extends Base {
	//이 클래스만 건들여서 오버라이드를 통해 출력물 만들것.
	//절대 메인 베이스 건들지 말것
	public void service(String state){
		if( state.equals( "낮" ) ) {
			day();
		} else if( state.equals( "밤" ) ) {
			night();
		}else{
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		}
	}
	
	public void day(){
		System.out.println("낮에는 열심히 일하자!");
	}
	
}
