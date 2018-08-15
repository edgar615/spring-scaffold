package com.github.edgar615.util.spring.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@ConfigurationProperties(prefix = "caching")
public class CacheProperties {

  /**
   * 动态生成缓存名称的定义
   */
  private List<String> dynamic = new ArrayList<>();

  private Redis redis = new Redis();

  private Caffeine caffeine = new Caffeine();

  public Redis getRedis() {
    return redis;
  }

  public void setRedis(Redis redis) {
    this.redis = redis;
  }

  public Caffeine getCaffeine() {
    return caffeine;
  }

  public void setCaffeine(Caffeine caffeine) {
    this.caffeine = caffeine;
  }

  public List<String> getDynamic() {
    return dynamic;
  }

  public void setDynamic(List<String> dynamic) {
    this.dynamic = dynamic;
  }

  public static class Caffeine {

    private Map<String, String> spec;

    public Map<String, String> getSpec() {
      return spec;
    }

    public void setSpec(Map<String, String> spec) {
      this.spec = spec;
    }
  }

  public static class Redis {
    private Map<String, RedisCacheSpec> spec;

    public Map<String, RedisCacheSpec> getSpec() {
      return spec;
    }

    public void setSpec(
            Map<String, RedisCacheSpec> spec) {
      this.spec = spec;
    }
  }
}
