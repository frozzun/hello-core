package hello.core.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//MyLogger 가짜를 만드는 것 이다. (proxy)
public class MyLogger {
  private String uuid;

  @Setter
  private String requestURL;

  public void log(String message) {
    System.out.println("[" + uuid + "]" + "[" + requestURL + "] " +message);
  }

  @PostConstruct
  public void init() {
    uuid = UUID.randomUUID().toString();
    System.out.println("[" + uuid + "] request scope bean create:" + this);
  }

  @PreDestroy
  public void close() {
    System.out.println("[" + uuid + "] request scope bean close:" + this);
  }
}