package day13;
import java.util.*;
//java.util 패키지에 있는 모든 클래스 import
/*
    1. 6개의 로또 번호를 저장할 배열
    2. 보너스 숫자를 저장할 변수
    3. 사용자에게 6개의 숫자를 입력 받아 저장할 배열
    4. 사용자에게 보너스를 입력받아 저장할 변수
    5. 동일한 숫자가 몇 개인지 카운팅할 변수
 */
public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int lottoAr[]=new int[6];
        int userAr[]=new int[6];
        int bonus,bonusUser;
        int count=0;
        //로또 배열에 6개의 랜덤값을 저장
        for(int i=0;i<6;i++){
            lottoAr[i]=random.nextInt(45)+1;
        }
        //bonus = random
        bonus=random.nextInt(45)+1;

        //사용자에게 6개의 갑소가 보너스를 입력
        System.out.println("숫자 6개 입력");
        for(int i=0; i<6;i++){
            userAr[i]=sc.nextInt();
        }
        System.out.println("보너스 값 입력");
        bonusUser=sc.nextInt();
        System.out.println("===============================================");
        //로또 배열의 값과 사용자배열의 값중 같은 값이 몇개 있는지 카운팅
        for(int j=0; j<6; j++){
            for(int i=0; i<6;i++){
                if(lottoAr[0]==userAr[i]){
                    count++;
                }
            }
        }
        //count의 갯수에 따라서 등수정하기
        if(count==6){
            System.out.println("축하드립니다!! 1등입니다");
        }else if(count==5){
            if(bonus==bonusUser){
                System.out.println("축하드립니다! 2등입니다");
            }else{
                System.out.println("축하드립니다! 3등입니다");
            }
        }else if(count==4){
            System.out.println("축하드립니다 4등입니다");
        }else if(count==3){
            System.out.println("축하드립니다 5등입니다");
        }else{
            System.out.println("아쉽지만 다음 기회에!!");
        }
    }
}
