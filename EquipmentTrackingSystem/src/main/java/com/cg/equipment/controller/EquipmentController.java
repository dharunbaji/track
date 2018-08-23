package com.cg.equipment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.equipment.bean.EquipmentRecord;
import com.cg.equipment.equipmentTrackingException.TrackingException;
import com.cg.equipment.equipmentTrackingService.IEquipmentTrackingService;

@RestController
public class EquipmentController {
	
	@Autowired
	private IEquipmentTrackingService service;
	
	@RequestMapping(value="/addrecord",method=RequestMethod.POST)
	public EquipmentRecord addEquipmentRecord(@RequestBody EquipmentRecord record) throws TrackingException {
		service.addEquipmentRecord(record);
		return record;
	}
	
	@RequestMapping(value="/getbyEquipmentTag")
	public EquipmentRecord findByEquipmentTag(String equipmentTag) throws TrackingException{
		
		return service.findByEquipmentTag(equipmentTag);
		
	}
	
	@RequestMapping(value="/getbyUserId")
	public EquipmentRecord findByUserId(String userId) throws TrackingException{
		
	return service.findByUserId(userId);
	
	}
	@RequestMapping(value="/getbyLocation")
	public EquipmentRecord findByLocation(String location) throws TrackingException{
		
	return service.findByLocation(location);
	
	}
	@RequestMapping(value="/updateEquipment")
	public EquipmentRecord updateEquipment(EquipmentRecord equipment) throws TrackingException{
		return service.updateEquipment(equipment);
	}
	

}
