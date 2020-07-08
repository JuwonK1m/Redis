# Redis
## BCSD BackEnd Regular Spring3 MVC 프로젝트 Redis 환경 세팅 가이드를 위한 프로젝트 구조
1. pom.xml에 Redis관련 dependency 추가
2. RedisConfig에서 JedisConnectionFactory Bean을 생성하여 Redis 커넥션을 만들고, StringRedisTemplate Bean에 주입
3. StringRedisTemplate Bean을 Redis 데이터 타입 템플릿 클래스에 주입하여 사용.
  - String
    - ValueOperations<K, V>
  - List
    - ListOperations<K, V>
  - Hash
    - HashOperations<H, HK, HV>
  - Set
    - SetOperations<K, V>
  - Sorted Set
    - ZSetOperations<K, V>
  
