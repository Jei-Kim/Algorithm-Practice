# chapter06. 화면 설계

## 사용자 인터페이스(*)

- 사용자 인터페이스(UI)는 사용자와 시스템 간의 상호작용이 원활하게 이뤄지도록 도와주는 장치나 소프트웨어를 의미한다.

* 사용자 인터페이스의 구분
    - CLI: 명령과 출력이 텍스트 형태로 이뤄지는 인터페이스
    - GUI: 아이콘이나 메뉴를 마우스로 선택하여 작업을 수행하는 그래픽 환경의 인터페이스
    - NUI: 사용자의 말이나 행동으로 기기를 조작하는 인터페이스

* 사용자 인터페이스의 기본 원칙(직/유/학/유)
    - 직관성: 누구나 쉽게 이해하고 사용할 수 있어야 함
    - 유효성: 사용자의 목적을 정확하고 완벽하게 달성할 수 있어야 함
    - 학습성: 누구나 쉽게 배우고 익힐 수 있어야 함
    - 유연성: 사용자의 요구사항을 최대한 수용하고 실수를 최소화해야 함

## UI 표쥰 및 지침

- UI 표준: 전체 시스템에 포함된 모든 UI에 공통적으로 적용될 내용, 화면 구성이나 이동 등
- UI 지침: UI 요구사항, 구현 시 제약사항 등 개발 과정에서 꼭 지켜야 할 공통의 조건
- UI 스타일 가이드: 개발자나 디자이너들이 UI를 작성할 때 기준이 되는 규칙들(구동 환경, 레이아웃, 네비게이션 등 정의)
    - 작성 순서
        : 구동 환경 정의 -> 레이아웃 정의 -> 네비게이션 정의 -> 기능 정의 -> 구성 요소 정의

## UI 설계 도구(*)

* 와이어프레임
    - 페이지에 대한 개략적인 레이아웃이나 뼈대를 설계하는 도구이다.
    - 기획 단계의 초기에 제작
    - 개발자나 디자이너 등이 레이아웃을  협의하거나 현재 진행 상태 등을 공유하기 위해 사용
    - 와이어프레임 툴: 손그림, 파워포인트, 키노트, 스케치, 일러스트, 포토샵 등

* 목업
    - 와이어프레임보다 좀 더 실제 화면과 유사하게 만든 정적인 형태의 모형
    - 디자인, 사용 방법 설명, 평가 등을 위해 만들어짐
    - 시각적으로 구성 요소를 배치하는 것
    - 목업 툴: 파워 목업, 발사믹 목업 등

* 스토리보드
    - 와이어프레임에 콘텐츠에 대한 설명, 페이지 간 이동 흐름 등을 추가한 문서
    - 디자이너와 개발자가 최종적으로 참고하는 작업 지침서
    - 서비스 구축을 위한 모든 정보가 들어 있음
    - 스토리보드 툴: 파워포인트, 키노트, 스케치, Axure 등

* 프로토타입
    - 와이어프레임이나 스토리보드 등에 인터랙션을 적용함으로써 실제 구현된 것처럼 테스트가 가능한 동적인 형태의 모형
    - 일부 핵심적인 기능만을 제공
    - 종류: 페이퍼 프로토타입 / 디지털 프로토타입

* 유스케이스
    - 사용자의 요구사항을 기능 단위로 표현하는 것
    - 일반적으로 다이어그램 형식으로 묘사

## UI 요구사항 확인

* UI 요구사항 확인 순서
    - 목표 정의 -> 활동 사항 정의 -> UI 요구사항 작성

* UI 요구사항 작성 순서
    - 요구사항 요소 확인 -> 정황 시나리오 작성 -> 요구사항 작성

* 요구사항 요소
    - 데이터 요구: 사용자가 요구하는 모델과 객체들의 주요 특성을 기반으로 하여 데이터 객체들을 정리
    - 기능 요구: 사용자의 목적 달성을 위해 무엇을 실행해야 하는지를 동사형으로 설명
    - 제품/서비스의 품질: 데이터 및 기능 요구 외에 제품의 품질, 서비스, 감성적인 품질 등 고려하여 작성
    - 제약 사항: 데드라인, 비용, 시스템 준수에 필요한 규제 등

## 품질 요구사항(**)

* 품질 요구사항
- 소프트웨어 품질은 소프트웨어에 대한 요구사항이 사용자의 입장에서 얼마나 충족하는가를 나타내는 소프트웨어 특성의 총체이다.
- 소프트웨어의 품질은 사용자의 요구사항을 충족시킴으로써 확립된다.
    
    * 소프트웨어 품질 관련 표준
        - ISO/IEC 9126: 소프트웨어의 품질 특성과 평가를 위한 국제 표준
        - ISO/IEC 25010: ISO/IEC 9126에 호환성과 보안성을 강화하여 개정한 소프트웨어 제품에 대한 국제 표준
        - ISO/IEC 12119: 패키지 소프트웨어의 일반적인 제품 품질 요구사항 및 테스트를 위한 국제 표준
        - ISO/IEC 14598: 소프트웨어 품질의 측정과 평가에 필요 절차를 규정한 표준

* ISO/IEC 9126의 소프트웨어 품질 특성(기/신/사/효/유/이)
    - 기능성: 소프트웨어가 사용자의 요구사항을 정확하게 만족하는 기능을 제공하는지 여부를 나타냄
    - 신뢰성: 주어진 시간동안 주어진 기능을 오류 없이 수행할 수 있는 정도를 나타냄
    - 사용성: 사용자와 컴퓨터 사이에 발생하는 어떠한 행위에 대하여 사용자가 정확하게 이해하고 사용하며, 향후 다시 사용하고 싶은 정도를 나타냄
    - 효율성: 사용자가 요구하는 기능을 얼마나 빠르게 처리할 수 있는지 정도를 나타냄
    - 유지보수성: 환경의 변화 또는 새로운 요구사항이 발생했을 때 소프트웨어를 개선하거나 확장할 수 있는 정도를 나타냄
    - 이식성: 소프트웨어가 다른 환경에서도 얼마나 쉽게 적용할 수 있는지 정도를 나타냄

## UI 설계

- UI 설계서: 사용자의 요구사항을 바탕으로 UI 설계를 구체화하여 작성하는 문서
- UI 흐름 설계: 업무의 진행 과정이나 수행 절차에 따른 흐름을 파악하여 화면과 폼을 설계
- UI 상세 설계: UI 설계서를 바탕으로 실제 설계 및 구현을 위해 모든 화면에 대해 자세하게 설계를 진행하는 단계
    - 상세 설계 시 반드시 시나리오를 작성해야 함
- 시나리오 문서는 사용자 인터페이스의 기능 구조, 대표 화면, 화면 간 인터랙션의 흐름, 예외 처리 등을 정리한 문서이다. 사용자가 최종 목표를 달성하기 위한 방법이 순차적으로 묘사되어 있다.

## HCI / UX / 감성공학

* HCI(Human Computer Interaction or Interface)
    - 사람이 시스템을 편리하고 안전하게 사용할 수 있도록 연구하고 개발하는 학문

* UX(User Experience)
    - 사용자가 시스템이나 서비스를 이용하면서 느끼고 생각하게 되는 총체적인 경험
        (UI가 사용성, 접근성, 편의성을 중시한다면 UX는 사용자가 이러한 경험을 통해 느끼는 만족이나 감정을 중시함)

    * 특징
        - 주관성
        - 정황성
        - 총체성

* 감성공학
    - 제품이나 작업환경을 사용자의 감성에 알맞도록 설계 및 제작하는 기술