/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-22 04:58:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class product_005fdetail_005fme_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/common/ad.jsp", Long.valueOf(1603285688018L));
    _jspx_dependants.put("/resources/globalVariable.jsp", Long.valueOf(1602818384000L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1603341990242L));
    _jspx_dependants.put("/WEB-INF/views/common/nav.jsp", Long.valueOf(1603342167804L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1603285688061L));
    _jspx_dependants.put("/WEB-INF/views/common/tom.jsp", Long.valueOf(1603285688093L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>로컬마켓</title>\r\n");
      out.write('\r');
      out.write('\n');

	String context = request.getContextPath();

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar context = \"");
      out.print( context );
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<link rel = \"icon\" href = \"");
      out.print( context );
      out.write("/favicon.ico\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(context);
      out.write("/resources/css/base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(context);
      out.write("/resources/css/content-area.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(context);
      out.write("/resources/css/content.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(context);
      out.write("/resources/css/product_detail.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");

	Member loginMember = (Member)session.getAttribute("loginMember");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id='header'>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( context );
      out.write("/\"> \r\n");
      out.write("\t\t\t\t<img id='logo-img' alt=\"로컬마켓\" src=\"");
      out.print( context );
      out.write("/resources/images/rocket.png\"></a>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( context );
      out.write("/\"><span id=\"logo-text\">로켓</span></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"header-search\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"찾으시는 상품 또는 동네를 검색하세요!\"> \r\n");
      out.write("\t\t\t\t<button class=\"glyphicon glyphicon-search\"></button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"account\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print( context );
      out.write("/login.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"id-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"idInput\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"login\" value=\"로그인\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"pw-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"pwInput\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" id=\"signup\" value=\"회원가입\" onclick=\"location.href='");
      out.print( context );
      out.write("/joinForm.do'\">회원가입</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"account_info\">\r\n");
      out.write("\t\t\t\t\t<label id=\"memberIcon\" class=\"glyphicon glyphicon-user\"></label>\r\n");
      out.write("\t\t\t\t\t<div id=\"membername\">");
      out.print( loginMember.getNickName() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"memberbtn\">\r\n");
      out.write("\t\t\t\t\t\t<button id='logoutBtn' onclick=\"location.href='");
      out.print( context );
      out.write("/logout.do'\">로그아웃</button>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"myPageBtn\" onclick=\"location.href='");
      out.print( context );
      out.write("/myPage.do'\">마이페이지</button>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"messageBtn\">쪽지함</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<div id=\"content-area\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>nav</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/nav.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"nav\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t\t<div id=\"menu-area\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"out-menu\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"glyphicon glyphicon-camera\"><div>중고물품</div></label>\r\n");
      out.write("\t\t\t\t\t\t<li>중고 물품보기</li>\r\n");
      out.write("\t\t\t\t\t\t<li>중고 물품등록</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"out-menu\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"glyphicon glyphicon-tag\"><div>공동구매</div></label>\r\n");
      out.write("\t\t\t\t\t\t<li onclick=\"location.href='");
      out.print( context );
      out.write("/groupList.do'\">공동구매 목록조회</li>\r\n");
      out.write("\t\t\t\t\t\t<li>공동구매 캘린더</li>\r\n");
      out.write("\t\t\t\t\t\t");
 if(loginMember != null && loginMember.getRankCode() == 99) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li onclick=\"location.href='");
      out.print( context );
      out.write("/groupWriteForm.do'\">공동구매 물품등록</li>  <!-- /groupwrite.do로 경로 옮겨야해  -->\r\n");
      out.write("\t\t\t\t\t\t<li>입금 확인 조회</li> \r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"out-menu menuBtn\" onclick=\"location.href='");
      out.print( context );
      out.write("/boardList.do'\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"glyphicon glyphicon-list\" class=\"menuBtn\"><div class=\"menuBtn\">자유게시판</div></label>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t");
 if(loginMember != null && loginMember.getRankCode() == 99) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"out-menu\">\r\n");
      out.write("\t\t\t\t\t\t<div>관리자</div>\r\n");
      out.write("\t\t\t\t\t\t<li>회원 정보 관리</li>\r\n");
      out.write("\t\t\t\t\t\t<li>신고 목록 관리</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Top of this Month</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/tom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"tom\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<b>이달의 로켓왕!</b>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table id=\"tom-table\">\r\n");
      out.write("\t\t\t<tr id=\"table-head\">\r\n");
      out.write("\t\t\t\t<th>No.</th>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>거래 수</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>김로켓</td>\r\n");
      out.write("\t\t\t\t<td>16</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>박마켓</td>\r\n");
      out.write("\t\t\t\t<td>14</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t<span id=\"title\"><b>공동구매 물품</b></span>\r\n");
      out.write("\t\t\t\t<div id=\"product-box\">\r\n");
      out.write("\t\t\t\t\t<div id=\"product-header\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"main-inform\"><b>공동구매 물품</b></span> <br>\r\n");
      out.write("\t\t\t\t\t\t<p id=\"explain\">\r\n");
      out.write("\t\t\t\t\t\t\t게시자 : <span>관리자</span><br>\r\n");
      out.write("\t\t\t\t\t\t\t시작일 : <span>2020.09.23</span>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t종료일 : <span>2020.09.30</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"product-body1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"product-inform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"product-body2\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"bookmark\">상품\r\n");
      out.write("\t\t\t\t\t\t\t찜하기&nbsp; <input type=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div id=\"product-footer\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"condition-area\">\r\n");
      out.write("\t\t\t\t\t\t\t<p id=\"explain\">댓글</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"commentWrite\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"comment\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"comment_register\" type=\"submit\" value=\"등록\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tfunction enroll() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar enroll = confirm(\"등록하시겠습니까?\")\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tif (enroll) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"del_mod_bt\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" id=\"mod-btn\" class=\"my-btn\" value=\"수정\" onclick=\"change();\">\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tfunction change() {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"수정페이지로 가는 기능넣기\")\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" id=\"del-btn\" class=\"my-btn\" value=\"삭제\" onclick=\"remove();\">\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tfunction remove() {\r\n");
      out.write("\t\t\t\t\t\t\tvar del = confirm(\"진짜?\")\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif (del) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/footer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t(주) 로켓 대표 KIM ROCKET | 서울 강남구 테헤란로14길 6 남도빌딩 2층 <br>\r\n");
      out.write("   E-mail rocket_manaer@rocket.co.kr | Tel 02-6952-0337 \r\n");
      out.write("   \r\n");
      out.write("   </footer>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>advertise</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/ad.css\">\r\n");
      out.write("<script src=\"");
      out.print( context );
      out.write("/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<aside id=\"advertise\">\r\n");
      out.write("\t\t<a href=\"#header\" id=\"topbt\">4위로▲</a>\r\n");
      out.write("\t\t<h2>광고 배너</h2>\r\n");
      out.write("\t\t<a href=\"http://iei.or.kr\" target=\"_blank\">\r\n");
      out.write("\t\t\t<img id=\"adImg\" src=\"");
      out.print( context );
      out.write("/resources/images/kh.png\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>kh정보교육원</b> \r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"http://nike.com\" target=\"_blank\">\r\n");
      out.write("\t\t\t<img id=\"adImg\" src=\"");
      out.print( context );
      out.write("/resources/images/ad1.jpg\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>에어 조던 1 로우</b>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<em>119,000</em>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<a href=\"http://nike.com\" target=\"_blank\">\r\n");
      out.write("\t\t\t<img id=\"adImg\" src=\"");
      out.print( context );
      out.write("/resources/images/ad1.jpg\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<b>에어 조던 1 로우</b>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<em>119,000</em>\r\n");
      out.write("\t</aside>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tadReset();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.onresize = function() {\r\n");
      out.write("\t\t  adReset();\t  \r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.onfocus = function() {\r\n");
      out.write("\t\t\tadReset();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction adReset() {\r\n");
      out.write("\t\t\tvar width = window.outerWidth;\r\n");
      out.write("\t\t\tvar ad = document.getElementById(\"advertise\");\r\n");
      out.write("\t\t\tif(width < 1591) {\r\n");
      out.write("\t\t\t\t ad.style.position = \"relative\";\r\n");
      out.write("\t\t\t\t ad.style.top = \"-80%\";\r\n");
      out.write("\t\t\t\t ad.style.right = \"-15%\";\r\n");
      out.write("\t\t\t  } else {\r\n");
      out.write("\t\t\t\t ad.style.position = \"fixed\";\r\n");
      out.write("\t\t\t\t ad.style.top = \"30%\";\r\n");
      out.write("\t\t\t\t ad.style.right = \"1%\";\r\n");
      out.write("\t\t\t  }\t\t  \r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
