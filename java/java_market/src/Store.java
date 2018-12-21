import java.util.ArrayList;
import java.util.Scanner;

public class Store {

  ArrayList<Product> products= new ArrayList<>();
  Scanner scan = new Scanner(System.in);

  Store()
  {
    addproducts();
    System.out.println("전자상가의 오신것을 환영합니다");
  }

  void addproducts() {
    products.add(new KtTv());
    products.add(new Audio());
    products.add(new NoteBook());
    products.add(new Lgtv());
  }

  Buyer shopping(Buyer buyer)
  {
    int total = 0;
    int index = 0;
    String userMsg = "";
    System.out.println("원하시는 상품번호를 눌러주세요");
    for(Object product : products)
    {
      index++;
      System.out.println(index+". "+product.getClass().getSimpleName());
    }
    int select = scan.nextInt()-1;

    System.out.println( "고객님이 구매하시려는 품목은 " + products.get(select).getClass().getSimpleName()+" 입니다");
    System.out.println("가격은 " +products.get(select).price+"원 입니다 구매하시겠습니까?  Y / N");

    scan.nextLine();
    userMsg = scan.nextLine();

    if(userMsg.equals("y"))
    {
      total += products.get(select).price;
      buyer.Wallet -= products.get(select).price;
      buyer.bonusPoint += products.get(select).bonuspoint;
      System.out.println("결제가 완료되었습니다");
      System.out.println("고객님의 카드잔액은 "+ buyer.Wallet+"이며,");
      System.out.println("쌓으신 포인트는 "+buyer.bonusPoint +" 입니다.");
      buyer.getProducts.add(products.get(select));

      System.out.println("물품을 더구매하시겠습니까?  Y  /  N");
      userMsg =  scan.nextLine();
      if(userMsg.equals("y"))
      {
        shopping(buyer);
      }
      else
      {
        System.out.println("저희매장을 이용해주셔서 감사합니다.");
        System.out.println("오늘 총 결제금액은"+ total+ "원 이며,");
        System.out.println("남은 카드금액은 " + buyer.Wallet + "원 입니다");
        System.out.println("총 적립하신 포인트는" + buyer.bonusPoint + " 포인트 입니다.");
        System.out.println("오늘 구매하신 물품은");
        for ( Object products :buyer.getProducts) {
          userMsg += products.getClass().getSimpleName() + ", ";
        }
        System.out.println( userMsg + " 입니다.");
      }
    }else
    {
      System.out.println("다른물품을 구매하시겠습니까?");
      userMsg = scan.nextLine();
      if(userMsg.equals("y"))
      {
        shopping(buyer);
      }else
      {
        System.out.println("저희매장을 이용해주셔서 감사합니다.");
      }
      System.out.println("저희매장을 이용해주셔서 감사합니다.");
    }
    return buyer;
  }
}
