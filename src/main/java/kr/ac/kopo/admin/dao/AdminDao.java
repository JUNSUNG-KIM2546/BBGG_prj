package kr.ac.kopo.admin.dao;

import java.util.List;

import org.springframework.ui.Model;

import kr.ac.kopo.fake.web.FakeVO;
import kr.ac.kopo.item.web.ItemVO;
import kr.ac.kopo.partner.web.PartnerVO;
import kr.ac.kopo.user.web.UserVO;

public interface AdminDao {

	List<UserVO> userList(UserVO userVO);
	List<PartnerVO> partnerList(PartnerVO partnerVO);
	List<ItemVO> itemList(ItemVO itemVO);
	List<FakeVO> fakeList(FakeVO fakeVO);
	
	int countUser();
	int countUserYestd();
	int countPartner();
	int countPartnerYestd();
	int countItem();
	int countItemYestd();
	int countFake();
	int countFakeYestd();
}
