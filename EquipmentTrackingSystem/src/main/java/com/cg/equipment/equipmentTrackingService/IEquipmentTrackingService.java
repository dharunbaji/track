package com.cg.equipment.equipmentTrackingService;

import org.springframework.data.repository.query.Param;

import com.cg.equipment.bean.EquipmentRecord;
import com.cg.equipment.equipmentTrackingException.TrackingException;

public interface IEquipmentTrackingService {

	public EquipmentRecord addEquipmentRecord(EquipmentRecord record) throws TrackingException;
	
	public EquipmentRecord findByEquipmentTag(String equipmentTag) throws TrackingException;
	
	public EquipmentRecord findByUserId(String userId) throws TrackingException;
	
	public EquipmentRecord findByLocation(String location) throws TrackingException;
	
	public EquipmentRecord updateEquipment(EquipmentRecord equipment) throws TrackingException;
	
	
}
