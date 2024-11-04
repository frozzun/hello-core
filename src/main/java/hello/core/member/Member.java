package hello.core.member;

import lombok.*;

/**
 *
 *
 * @filename : Member.java
 * @author frozzun
 * @since 11/04/24
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Member {
  private Long id;
  private String name;
  private Grade grade;


}
