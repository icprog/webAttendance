package com.cmhit.service.kaoqinchuli.buqiandenji.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmhit.dao.StaffRetroactiveMapper;
import com.cmhit.dao.StaffclassperiodsigninrecordMapper;
import com.cmhit.po.StaffRetroactive;
import com.cmhit.po.Staffclassperiodsigninrecord;
import com.cmhit.service.kaoqinchuli.buqiandenji.IdealwihthRetroativeSv;
import com.cmhit.vo.DealwihthRetroative;
import com.cmhit.vo.Unusual;
@Transactional
@Service("idealwihthRetroativeSv")
public class DealwihthRetroativeImpl implements IdealwihthRetroativeSv{
	@Autowired
	StaffRetroactiveMapper  staffRetroactiveDao;
	@Autowired
	StaffclassperiodsigninrecordMapper staffclassperiodsigninrecordDao;
	/**查询异常信息进行处理**/ 
	public List<Unusual> selectUnusual() {
	return staffRetroactiveDao.selectUnusual();
	}
	 /**处理异常考勤时修改考勤类别**/
	public int updateAttendanceType(int staffClassPeriodSignInRecordId,
			int attendanceClassChildId) {
	   int i=staffRetroactiveDao.updateAttendanceType(staffClassPeriodSignInRecordId, attendanceClassChildId);
		return i;
	}
	 /**查询所有补签申请**/
	public List<DealwihthRetroative> selectDealwihthRetroative(int checkStateId) {
		return staffRetroactiveDao.selectDealwihthRetroative(checkStateId);
	}
	/**修改签到表**/
	public int updateStaffclassperiodsigninrecord(Staffclassperiodsigninrecord t) {
		int i= staffclassperiodsigninrecordDao.updateByPrimaryKeySelective(t);
		return i;
	}
	 /**修改补签登记表**/
	public int updateStaffretroactive(StaffRetroactive t) {
		int i=staffRetroactiveDao.updateByPrimaryKeySelective(t);
		return i;
	}
	
}
