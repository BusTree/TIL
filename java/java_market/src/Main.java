public class Main {

  public static void main(String[] args) {

    Store store =new Store();
    Buyer doneBuyer = store.shopping(new Buyer());
    System.out.println("쇼핑후 남은잔액 : "+doneBuyer.Wallet + "원");

    //  [ 클라이언트 요구사항 ]
//  가전제품은 제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있다
//  각각의 가전제품은 제품별 이름을 가지고 있다
//
//  각각의 전자제품은 이름을 가지고 있다 (ex : Tv , Audio , Computer)
//  각각의 전자제품은 다른 가격을 가지고 있다(ex : Tv:5000 , Audio:6000)
//  제품의 포인트는 가격의 10%를 가진다
//
//  시뮬레이션 시나리오
//  구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
//  구매자는 제품을 구매할 수 있다 , 구매행위를 하게 되면 가지고 있는 금액은
//  감소하고 포인트는 올라간다
//  구매자는 처음 초기 금액을 가진다
//
////구매행위
////구매행위 (잔액금액 - 제품의 가격 , 포인트 갱신)
////구매자는 매장이 있는 모든 제품을 구매할 수 있다
////구현 함수
////매장에 있는 (Kttv , audio , notebook) 구매 하세요
////kttvbuy(){} , audiotbuy(){} , notebookbuy(){}
//
//  문제) 위 시나리오 기반으로 구매자 클래스를 구현하세요

  }
}
