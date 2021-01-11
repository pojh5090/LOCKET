package apply.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apply.model.service.ApplyService;
import apply.model.vo.Apply;
import apply.model.vo.PageInfo;
import member.model.vo.Member;

/**
 * Servlet implementation class Buy_List_ClientServlet
 */
@WebServlet("/buy_list_c.do")
public class BuyList_ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyList_ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = ((Member)request.getSession().getAttribute("loginMember")).getId();
		ApplyService aService = new ApplyService();
		
		int listCount; // 총 게시글 개수
		int currentPage; // 현재 페이지
		int pageLimit; // 한 페이지에 표시될 페이지 수
		int boardLimit; // 한 페이지에 보일 게시글 최대 개수
		int maxPage; // 전체 페이지 중 가장 마지막 페이지
		int startPage; // 페이징이 된 페이지 중 시작 페이지
		int endPage; // 페이징이 된 페이지 중 마지막 페이지
		
		listCount = aService.getUserListCount(id);
		
		currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		pageLimit = 10;
		boardLimit = 10;
		
		// maxPage 계산
		maxPage = (int) Math.ceil((double) listCount / boardLimit);
		
		// startPage 계산
		startPage = pageLimit * ((currentPage - 1) / pageLimit) + 1;
		
		// endPage 계산
		endPage = startPage + pageLimit - 1;
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, pageLimit, boardLimit, maxPage, startPage, endPage);

		ArrayList<Apply> cList = aService.selectList_C(pi, id);
		
		String page = null;
		if(cList != null) {
			page = "WEB-INF/views/group/buy_list_client.jsp";
			request.setAttribute("cList", cList);
			request.setAttribute("pi", pi);
		} else {
			page = "WEB-INF/views/common/alertPage.jsp";
			request.setAttribute("msg", "입금 조회에 실패하였습니다.");
			request.setAttribute("path", request.getContextPath());
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
