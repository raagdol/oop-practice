# oop-practice
## JUnit5 dependencies
```testImplementation 'org.junit.jupiter:junit-jupiter'``` <br />
```testImplementation 'org.junit.jupiter:junit-jupiter-params:5.8.2'``` <br /> <br />

## AssertJ library dependencies
```testImplementation 'org.assertj:assertj-core:3.23.1'``` <br /> <br />


## 테스트 코드를 작성하는 이유는?
1. 문서화 역할
2. 코드에 결함을 발견하기 위함
3. 리팩토링 시 안전성 확보
4. 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음 <br /> <br />


## TDD (Test Driven Development)
테스트 주도 개발(TDD)은 소프트웨어 개발 방법론 중 하나로, <br />
코드를 작성하기 전에 테스트 케이스를 먼저 작성하고, 그 다음에 해당 테스트를 통과하는 코드를 작성하는 개발 방법입니다. <br />
TDD는 개발 프로세스를 다음과 같이 세 가지 단계로 나눕니다: <br />

#### 1. 테스트 작성(Test)
개발할 기능 또는 모듈에 대한 테스트 케이스를 작성합니다. <br />
이 단계에서 작성한 테스트는 아직 통과하지 않을 것이며, <br />
실제 코드가 아직 없는 상태에서 테스트 케이스를 먼저 작성하는 것이 핵심

#### 2. 코드 작성(Code)
테스트를 통과하기 위한 최소한의 코드를 작성합니다. 목표는 작성한 테스트 케이스를 통과하는 코드를 만드는 것입니다. <br />
이 때, 테스트를 통과하기 위한 최소한의 코드를 작성하는 것이 중요하며, 불필요한 코드를 작성하지 않도록 주의해야 함

#### 3. 리팩토링(Refactor)
테스트 케이스를 통과한 후, 코드를 리팩토링하여 코드의 가독성과 유지보수성을 개선합니다. <br />
리팩토링은 기능을 변경하지 않고 코드의 구조를 개선하는 것을 의미함 <br /> <br />

## TDD의 장점
#### 1. 안정성 보장
테스트 케이스를 먼저 작성하므로 코드의 안정성 확보됨
#### 2. 문서화
각 기능에 대한 테스트 케이스는 코드의 문서 역할을 하며, 코드의 의도를 명확히 설명함
#### 3. 결함 감지 및 수정
결함을 빠르게 감지하고 수정할 수 있으므로 소프트웨어 품질이 향상됨
#### 4. 설계 개선
테스트 코드 작성 과정에서 더 낮은 결합도와 높은 응집도를 가진 코드를 작성하게 되므로 설계 개선에 도움이 됨
<br /> <br />
## BDD (Behavior-Driven Development)
TDD의 확장으로서, 소프트웨어 개발에 있어서 기능이나 동작에 중점을 두는 개발 방법입니다. <br />
BDD는 사용자의 요구사항이나 기대 동작에 기반하여 소프트웨어를 개발하고 문서화하는 데 중점을 두며 <br />
다양한 이해관계자들 간의 의사 소통을 촉진합니다. <br />

#### 1. 기능 정의(Feature Definition)
소프트웨어에 추가할 새로운 기능이나 기대하는 동작을 정의합니다. <br />
비즈니스 측면에서의 기능 설명을 포함하며, "어떤 동작을 원하는가?"에 초점을 맞춤

#### 2. 시나리오 작성(Scenario Writing)
시나리오는 사용자나 시스템의 특정 동작을 설명하는 스토리 형식으로 작성되며 <br />
Given - When - Then 구조를 사용합니다. <br />
Given: 시나리오의 선행 조건 또는 초기 상태를 정의 <br />
When: 특정 동작 또는 이벤트를 발생시키는 조건 정의 <br />
Then: 기대하는 결과나 동작의 결과를 정의

#### 3. 테스트 코드 작성(Test Code Writing)
작성한 시나리오를 기반으로 테스트 코드를 작성합니다. <br />
테스트 코드는 Given - When - Then 구조를 따라 구성되며, 각 단계별로 행동을 검증하는 테스트 코드를 작성함

#### 4. 테스트 실행(Test Execution)
작성한 테스트 코드를 실행하여 시나리오에 대한 검증을 수행합니다. <br />
테스트가 성공적으로 통과하면 해당 기능이 요구사항을 만족하고 정상적으로 작동함을 의미함

#### 5. 리팩토링(Refactoring)
필요한 경우 테스트 코드와 실제 코드를 개선하고 리팩토링을 수행합니다. <br />
코드의 가독성과 유지보수성을 개선하며, 테스트 케이스가 유지되는 한 시스템을 안정적으로 유지함

#### 6. 반복(Iteration)
다른 기능 또는 시나리오에 대한 작업을 반복합니다. <br />
요구사항이나 변경 사항이 발생하면 관련된 시나리오와 테스트 코드를 업데이트하고 확장 <br /> <br />

## 일급 컬렉션(First-Class Collection)
컬렉션을 일반적인 데이터 구조가 아니라 독립적인 객체로 취급하고, <br />
해당 컬렉션과 관련된 동작과 속성을 추가하여 코드의 가독성과 유지보수성을 높이는데 사용됨 <br />

## 일급 컬렉션의 장점
#### 1. 가독성 향상
컬렉션과 관련된 동작이 해당 컬렉션 클래스 내에 캡슐화되므로 코드의 가독성이 향상된다.
#### 2. 유지보수성 향상
컬렉션과 관련된 동작을 한 곳에 집중하므로 유지보수가 더 쉬워짐
#### 3. 추상화
컬렉션을 객체로 감싸면서 해당 컬렉션의 의미와 역할을 명확하게 표현할 수 있음
#### 4. 타입 안정성
컬렉션을 객체로 감싸면 해당 컬렉션에 대한 타입 검사와 안전성을 높일 수 있음
