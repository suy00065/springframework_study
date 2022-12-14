# springframework_study

<hr>
<ul>
    <li>2022년 10월 11일부터 시작</li>
    <li>수업 내용 정리 및 개인적인 공부 내용 정리</li>
</ul>
<br>
<h2>Spring Framework Overview</h2>
<hr>
<br>
<h3> 스프링 프레임워크란? </h3>
<br>
<p>자바 엔터프라이즈 개발을 편하게 해주는 오픈소스 경량급 애플리케이션 프레임워크</p>
<ul>
    <li>대규모 데이터 처리와 트랜잭션이 동시에 여러 사용자로부터 행해지는 매우 큰 규모의 환경을 엔터프라이즈 환경이라 일컫음.</li>
</ul>
<p>스프링 프레임워크는 경량 컨테이너로 자바 객체를 담고 직접 관리하는데 객체의 생성 및 소멸, 라이프사이클을 관리하며 언제든 Spring 컨테이너로부터 필요한 객체를 가져와 사용할 수 있음.</p>
<br>
<h3> 스프링 프레임워크의 특징</h3>
<br>
<p>1. 경량 컨테이너로서, Spring Bean을 직접 관리한다.</p>
    <ol>- Spring Bean 객체의 라이프 사이클을 관리한다.</ol>
    <ol>- Container는 Spring Bean 객체의 생성, 보관, 제거에 관한 모든 일을 처리한다.</ol>
<p>2. POJO(Plain Old Java Object) 기반의 프레임워크</p>
    <ol>- Getter와 Setter로 구성된 가장 순수한 형태의 기본 클래스</ol>
    <ol>- 일반적인 J2EE 프레임워크와 비교하여, 특정한 인터페이스를 구현하거나 상속을 받을 필요가 없음.</ol>
    <ol>- 기존에 존재하는 라이브러리를 사용하기 편리함</ol>