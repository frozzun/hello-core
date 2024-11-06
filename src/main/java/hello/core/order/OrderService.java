package hello.core.order;

/**
 *
 *
 * @filename : OrderService.java
 * @author frozzun
 * @since 11/06/24
 */
public interface OrderService {
  Order createOrder(Long memberId, String itenName, int itemPrice);
}
