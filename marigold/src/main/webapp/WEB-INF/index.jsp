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
			<input type="checkbox" name="firstCategory" value="1" />남성 <input
				type="checkbox" name="firstCategory" value="2" />여성 <input
				type="checkbox" name="firstCategory" value="3" />남녀공용
				<input
				type="checkbox" name="firstCategory" value="4" />키즈
		</form>

		<form method="get" action=#>
			<p>신발 종류</p>
			<input type="checkbox" name="secondCategory" value="1" />운동화
			<input type="checkbox" name="secondCategory" value="2" />스포츠
			<input type="checkbox" name="secondCategory" value="3" />구두 <input
				type="checkbox" name="secondCategory" value="4" />샌들 <input
				type="checkbox" name="secondCategory" value="5" />캐주얼 <input
				type="checkbox" name="secondCategory" value="6" />부츠
		</form>

		<form method="get" action=#>
			<p>스타일</p>
			<input type="checkbox" name="thirdCategory" value="01" />캔버스화 <input
				type="checkbox" name="thirdCategory" value="02" />스니커즈 <input
				type="checkbox" name="thirdCategory" value="03" />슬립온 <input
				type="checkbox" name="thirdCategory" value="04" />어글리슈즈 <input
				type="checkbox" name="thirdCategory" value="05" />커스텀 <input
				type="checkbox" name="thirdCategory" value="06" />런닝화 <input
				type="checkbox" name="thirdCategory" value="07" />농구화 <input
				type="checkbox" name="thirdCategory" value="08" />골프화 <input
				type="checkbox" name="thirdCategory" value="09" />등산화 <input
				type="checkbox" name="thirdCategory" value="10" />기능화 <input
				type="checkbox" name="thirdCategory" value="11" />축구화 <input
				type="checkbox" name="thirdCategory" value="12" />로퍼/플랫 <input
				type="checkbox" name="thirdCategory" value="13" />힐/펌프스 <input
				type="checkbox" name="thirdCategory" value="14" />슬링백/토오픈 <input
				type="checkbox" name="thirdCategory" value="15" />뮬/블로퍼 <input
				type="checkbox" name="thirdCategory" value="16" />레이스업 <input
				type="checkbox" name="thirdCategory" value="17" />슬라이드 <input
				type="checkbox" name="thirdCategory" value="18" />아쿠아슈즈 <input
				type="checkbox" name="thirdCategory" value="19" />스포츠샌들 <input
				type="checkbox" name="thirdCategory" value="20" />코르크샌들 <input
				type="checkbox" name="thirdCategory" value="21" />레더샌들 <input
				type="checkbox" name="thirdCategory" value="22" />드레스샌드 <input
				type="checkbox" name="thirdCategory" value="23" />슬리퍼 <input
				type="checkbox" name="thirdCategory" value="24" />워킹슈즈 <input
				type="checkbox" name="thirdCategory" value="25" />워커부츠 <input
				type="checkbox" name="thirdCategory" value="26" />패딩부츠 <input
				type="checkbox" name="thirdCategory" value="27" />첼시부츠 <input
				type="checkbox" name="thirdCategory" value="28" />미들부츠 <input
				type="checkbox" name="thirdCategory" value="29" />롱부츠 <input
				type="checkbox" name="thirdCategory" value="30" />레인부츠 <input
				type="checkbox" name="thirdCategory" value="31" />어그부츠 <input
				type="checkbox" name="thirdCategory" value="32" />앵클부츠
		</form>

		<form method="get" action=#>
			<p>재질</p>
			<input type="checkbox" name="material" value="01" />소가죽 <input
				type="checkbox" name="material" value="02" />송아지가죽 <input
				type="checkbox" name="material" value="03" />인조가죽/합성피혁 <input
				type="checkbox" name="material" value="04" />스웨이드 <input
				type="checkbox" name="material" value="05" />나일론 <input
				type="checkbox" name="material" value="06" />패브릭 <input
				type="checkbox" name="material" value="07" />악어가죽 <input
				type="checkbox" name="material" value="08" />양가죽 <input
				type="checkbox" name="material" value="09" />데님 <input
				type="checkbox" name="material" value="10" />에나멜 <input
				type="checkbox" name="material" value="11" />EVA/고무
				<input
				type="checkbox" name="material" value="12" />면/코튼
				<input
				type="checkbox" name="material" value="13" />레이온
		</form>

		<form method="get" action=#>
			<p>브랜드</p>
			<input type="checkbox" name="brand" value="001" />샤넬 <input
				type="checkbox" name="brand" value="002" />셀린느 <input type="checkbox"
				name="brand" value="003" />멀버리 <input type="checkbox" name="brand"
				value="004" />버버리 <input type="checkbox" name="brand" value="005" />메종마르지엘라
			<input type="checkbox" name="brand" value="006" />벨루티 <input
				type="checkbox" name="brand" value="007" />발리 <input type="checkbox"
				name="brand" value="008" />발망 <input type="checkbox" name="brand"
				value="009" />페레가모 <input type="checkbox" name="brand" value="010" />루이비통
			<input type="checkbox" name="brand" value="011" />구찌 <input
				type="checkbox" name="brand" value="012" />디올 <input type="checkbox"
				name="brand" value="013" />지방시 <input type="checkbox" name="brand"
				value="014" />빈폴 <input type="checkbox" name="brand" value="015" />폴로
			<input type="checkbox" name="brand" value="016" />랄프로렌 <input
				type="checkbox" name="brand" value="017" />에르메스 <input
				type="checkbox" name="brand" value="018" />로로피아나 <input
				type="checkbox" name="brand" value="019" />쿠치멜리 <input
				type="checkbox" name="brand" value="020" />마이클코어스 <input
				type="checkbox" name="brand" value="021" />마크제이콥스 <input
				type="checkbox" name="brand" value="022" />끌로에 <input
				type="checkbox" name="brand" value="023" />프라다 <input
				type="checkbox" name="brand" value="024" />르꼬끄 <input
				type="checkbox" name="brand" value="025" />데상트 <input
				type="checkbox" name="brand" value="026" />컨버스 <input
				type="checkbox" name="brand" value="027" />크록스 <input
				type="checkbox" name="brand" value="028" />라코스테 <input
				type="checkbox" name="brand" value="029" />금강재화 <input
				type="checkbox" name="brand" value="030" />리복 <input type="checkbox"
				name="brand" value="031" />아키클래식 <input type="checkbox" name="brand"
				value="032" />캐치볼 <input type="checkbox" name="brand" value="033" />닥터마틴
			<input type="checkbox" name="brand" value="034" />팀버랜드 <input
				type="checkbox" name="brand" value="035" />프레드페리 <input
				type="checkbox" name="brand" value="036" />스케쳐스 <input
				type="checkbox" name="brand" value="037" />푸마 <input type="checkbox"
				name="brand" value="038" />포즈간츠 <input type="checkbox" name="brand"
				value="039" />스테파노로시 <input type="checkbox" name="brand" value="040" />마크모크
			<input type="checkbox" name="brand" value="041" />버켄스탁 <input
				type="checkbox" name="brand" value="042" />젝시믹스 <input
				type="checkbox" name="brand" value="043" />포티세컨드 <input
				type="checkbox" name="brand" value="044" />뉴에라 <input
				type="checkbox" name="brand" value="045" />에버레스트 <input
				type="checkbox" name="brand" value="046" />스프리트 <input
				type="checkbox" name="brand" value="047" />써코니 <input
				type="checkbox" name="brand" value="048" />아식스 <input
				type="checkbox" name="brand" value="049" />블랙마틴싯봉 <input
				type="checkbox" name="brand" value="050" />블라도 <input
				type="checkbox" name="brand" value="051" />호킨스 <input
				type="checkbox" name="brand" value="052" />무인양품

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