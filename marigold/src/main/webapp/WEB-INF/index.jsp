<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" % trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#container {
	margin: 0 auto;
	border: 1px black solid;
}
</style>
</head>
<body>
	<div id="main">
		<form method="get" action=#">
			<input type="text" name="" /> <input type="submit" value="제품 찾기" />
		</form>
		<!-- name은 앞으로 정해야함. -->
	</div>
	<br />
	<br />
	<div id="container">

		<form method="get" action=#>
			<p>성별 및 연령</p>
			<input type="checkbox" name="firstCategory" value="100000000" />남성 <input
				type="checkbox" name="firstCategory" value="200000000" />여성 <input
				type="checkbox" name="firstCategory" value="300000000" />키즈
		</form>

		<form method="get" action=#>
			<p>신발 종류</p>
			<input type="checkbox" name="secondCategory" value="10000000" />운동화
			<input type="checkbox" name="secondCategory" value="20000000" />스포츠
			<input type="checkbox" name="secondCategory" value="30000000" />구두 <input
				type="checkbox" name="secondCategory" value="40000000" />샌들 <input
				type="checkbox" name="secondCategory" value="50000000" />캐주얼 <input
				type="checkbox" name="secondCategory" value="60000000" />부츠
		</form>

		<form method="get" action=#>
			<p>스타일</p>
			<input type="checkbox" name="thirdCategory" value="100000" />캔버스화 <input
				type="checkbox" name="thirdCategory" value="200000" />스니커즈 <input
				type="checkbox" name="thirdCategory" value="300000" />슬립온 <input
				type="checkbox" name="thirdCategory" value="400000" />어글리슈즈 <input
				type="checkbox" name="thirdCategory" value="500000" />커스텀 <input
				type="checkbox" name="thirdCategory" value="600000" />런닝화 <input
				type="checkbox" name="thirdCategory" value="700000" />농구화 <input
				type="checkbox" name="thirdCategory" value="800000" />골프화 <input
				type="checkbox" name="thirdCategory" value="900000" />등산화 <input
				type="checkbox" name="thirdCategory" value="1000000" />기능화 <input
				type="checkbox" name="thirdCategory" value="1100000" />축구화 <input
				type="checkbox" name="thirdCategory" value="1200000" />로퍼/플랫 <input
				type="checkbox" name="thirdCategory" value="1300000" />힐/펌프스 <input
				type="checkbox" name="thirdCategory" value="1400000" />슬링백/토오픈 <input
				type="checkbox" name="thirdCategory" value="1500000" />뮬/블로퍼 <input
				type="checkbox" name="thirdCategory" value="1600000" />레이스업 <input
				type="checkbox" name="thirdCategory" value="1700000" />슬라이드 <input
				type="checkbox" name="thirdCategory" value="1800000" />아쿠아슈즈 <input
				type="checkbox" name="thirdCategory" value="1900000" />스포츠샌들 <input
				type="checkbox" name="thirdCategory" value="2000000" />코르크샌들 <input
				type="checkbox" name="thirdCategory" value="2100000" />레더샌들 <input
				type="checkbox" name="thirdCategory" value="2200000" />드레스샌드 <input
				type="checkbox" name="thirdCategory" value="2300000" />슬리퍼 <input
				type="checkbox" name="thirdCategory" value="2400000" />워킹슈즈 <input
				type="checkbox" name="thirdCategory" value="2500000" />워커부츠 <input
				type="checkbox" name="thirdCategory" value="2600000" />패딩부츠 <input
				type="checkbox" name="thirdCategory" value="2700000" />첼시부츠 <input
				type="checkbox" name="thirdCategory" value="2800000" />미들부츠 <input
				type="checkbox" name="thirdCategory" value="2900000" />롱부츠 <input
				type="checkbox" name="thirdCategory" value="3000000" />레인부츠 <input
				type="checkbox" name="thirdCategory" value="3100000" />어그부츠 <input
				type="checkbox" name="thirdCategory" value="3200000" />앵클부츠
		</form>

		<form method="get" action=#>
			<p>재질</p>
			<input type="checkbox" name="material" value="1000" />소가죽 <input
				type="checkbox" name="material" value="2000" />송아지가죽 <input
				type="checkbox" name="material" value="3000" />인조가죽/합성피혁 <input
				type="checkbox" name="material" value="4000" />스웨이드 <input
				type="checkbox" name="material" value="5000" />나일론 <input
				type="checkbox" name="material" value="6000" />패브릭 <input
				type="checkbox" name="material" value="7000" />악어가죽 <input
				type="checkbox" name="material" value="8000" />양가죽 <input
				type="checkbox" name="material" value="9000" />데님 <input
				type="checkbox" name="material" value="10000" />에나멜 <input
				type="checkbox" name="material" value="11000" />EVA/고무
		</form>

		<form method="get" action=#>
			<p>브랜드</p>
			<input type="checkbox" name="brand" value="1" />샤넬 <input
				type="checkbox" name="brand" value="2" />셀린느 <input type="checkbox"
				name="brand" value="3" />멀버리 <input type="checkbox" name="brand"
				value="4" />버버리 <input type="checkbox" name="brand" value="5" />메종마르지엘라
			<input type="checkbox" name="brand" value="6" />벨루티 <input
				type="checkbox" name="brand" value="7" />발리 <input type="checkbox"
				name="brand" value="8" />발망 <input type="checkbox" name="brand"
				value="9" />페레가모 <input type="checkbox" name="brand" value="10" />루이비통
			<input type="checkbox" name="brand" value="11" />구찌 <input
				type="checkbox" name="brand" value="12" />디올 <input type="checkbox"
				name="brand" value="13" />지방시 <input type="checkbox" name="brand"
				value="14" />빈폴 <input type="checkbox" name="brand" value="15" />폴로
			<input type="checkbox" name="brand" value="16" />랄프로렌 <input
				type="checkbox" name="brand" value="17" />에르메스 <input
				type="checkbox" name="brand" value="18" />로로피아나 <input
				type="checkbox" name="brand" value="19" />쿠치멜리 <input
				type="checkbox" name="brand" value="20" />마이클코어스 <input
				type="checkbox" name="brand" value="21" />마크제이콥스 <input
				type="checkbox" name="brand" value="22" />끌로에 <input
				type="checkbox" name="brand" value="23" />프라다 <input
				type="checkbox" name="brand" value="82" />르꼬끄 <input
				type="checkbox" name="brand" value="83" />데상트 <input
				type="checkbox" name="brand" value="84" />컨버스 <input
				type="checkbox" name="brand" value="85" />크록스 <input
				type="checkbox" name="brand" value="86" />라코스테 <input
				type="checkbox" name="brand" value="87" />금강재화 <input
				type="checkbox" name="brand" value="88" />리복 <input type="checkbox"
				name="brand" value="89" />아키클래식 <input type="checkbox" name="brand"
				value="90" />캐치볼 <input type="checkbox" name="brand" value="91" />닥터마틴
			<input type="checkbox" name="brand" value="92" />팀버랜드 <input
				type="checkbox" name="brand" value="93" />프레드페리 <input
				type="checkbox" name="brand" value="94" />스케쳐스 <input
				type="checkbox" name="brand" value="95" />푸마 <input type="checkbox"
				name="brand" value="96" />포즈간츠 <input type="checkbox" name="brand"
				value="97" />스테파노로시 <input type="checkbox" name="brand" value="98" />마크모크
			<input type="checkbox" name="brand" value="99" />버켄스탁 <input
				type="checkbox" name="brand" value="100" />젝시믹스 <input
				type="checkbox" name="brand" value="101" />포티세컨드 <input
				type="checkbox" name="brand" value="102" />뉴에라 <input
				type="checkbox" name="brand" value="103" />에버레스트 <input
				type="checkbox" name="brand" value="104" />스프리트 <input
				type="checkbox" name="brand" value="105" />써코니 <input
				type="checkbox" name="brand" value="106" />아식스 <input
				type="checkbox" name="brand" value="107" />블랙마틴싯봉 <input
				type="checkbox" name="brand" value="108" />블라도 <input
				type="checkbox" name="brand" value="109" />호킨스 <input
				type="checkbox" name="brand" value="110" />무인양품

		</form>

		<form method="get" action=#>
			<p>가격대</p>
			<!-- value값 변경 가능 -->
			<input type="checkbox" name="price" value="1" />1만원-5만원 <input
				type="checkbox" name="price" value="2" />5만원-10만원 <input
				type="checkbox" name="price" value="3" />10만원-30만원 <input
				type="checkbox" name="price" value="4" />30만원-50만원 <input
				type="checkbox" name="price" value="5" />50만원 이상
		</form>

		<p>
			<input type="submit" value="찾기" />
		</p>

	</div>
</body>
</html>