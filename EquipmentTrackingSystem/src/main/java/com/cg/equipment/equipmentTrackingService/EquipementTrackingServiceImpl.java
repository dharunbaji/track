package com.cg.equipment.equipmentTrackingService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.equipment.bean.EquipmentRecord;
import com.cg.equipment.equipmentTrackingException.TrackingException;
import com.cg.equipment.equipmentTrackingRepo.EquipmentRecordRepo;

@Service
public class EquipementTrackingServiceImpl implements IEquipmentTrackingService {

	@Autowired
	private EquipmentRecordRepo repo;
	
	@Override
	public EquipmentRecord addEquipmentRecord(EquipmentRecord record) throws TrackingException {
		repo.save(record);
		return record;
	}

	@Override
	public EquipmentRecord findByEquipmentTag(String equipmentTag) throws TrackingException {
		if(!equipmentTag.matches("//d{10}")) {
			throw new TrackingException("EquipmentTag should contain only numbers and should not exceed 10");
			}
		return repo.findByEquipmentTag(equipmentTag);
	}
	
	@SuppressWarnings("unused")
	@Override
	public EquipmentRecord findByUserId(String userId) throws TrackingException {
	EquipmentRecord record = new EquipmentRecord();
	if(record==null) {
	throw new TrackingException("Given user Id is not present in the record");
	}
	else {
	return repo.findByUserId(userId);
	}
	}

	@SuppressWarnings("unused")
	@Override
	public EquipmentRecord findByLocation(String location) throws TrackingException {
	EquipmentRecord record = new EquipmentRecord();
	if(record==null) {
	throw new TrackingException("Given Location is not present in the record");
	}
	else {
	return repo.findByLocation(location);
	}
	}

	@Override
	public EquipmentRecord updateEquipment(EquipmentRecord equipment) throws TrackingException {
		 repo.saveAndFlush(equipment);
		 return equipment;
	}
	
	

}
