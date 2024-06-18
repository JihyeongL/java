* data_type 문자

어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
(ex. A 는 65)
문자세트 : 각 문자를 얼마로 표현할 것인지 코드 값을 모아둔 것을 문자세트(charater set)라 함
(ex. ASKII, euc-kr, utf-8:1~4byte로 유동적으로 표시, utf-16:모든 문자를 2byte로 표시)

자바는 문자를  나타내기 위해 전세계 표준인 UNICODE를 사용
utf-16 인코딩을 사용 (모든 문자를 2바이트로 표시)

문자를 위한 데이터 타입
char ch = 'A'; //'' single quotation 은 문자 , "" double quotation은 문자열 
내부적으로 숫자료 표현되므로 숫자를 넣어도 문자가 출력될 수 있음
char ch2 = 66;


character set: 문자를 숫자로 변환한 값의 세트

encoding: 문자가 숫자로 변환되는 것
decoding: 숫자에서 다시 문자로 변환되는 것

ASKII code: 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트

UNICODE: 전 세계 표준으로 만든 문자 세트

UTF-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음

UTF-16: 2바이트로 문자를 표현
