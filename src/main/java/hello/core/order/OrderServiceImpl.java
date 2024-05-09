package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) { // createOrder 객체에 memberId, itemName, itemPrice 를 넣어주면,
        Member member = memberRepository.findById(memberId); // memberRepository findById 메서드로 Member 객체(id, name, grade)를 가져오고,
        int discountPrice = discountPolicy.discount(member, itemPrice); // discountPolicy discount 메서드로 discount 가격을 불러와서
        // OrderService 는 discountPolicy 이 어떤것인지 상관없이 member 와 itemPrice 만 넣어주면 된다.

        return new Order(memberId, itemName, itemPrice, discountPrice); // discountPrice 파라미터를 추가하여 Order 객체를 반환한다.
    }


}
