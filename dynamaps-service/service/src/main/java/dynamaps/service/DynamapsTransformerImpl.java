package dynamaps.service;

import dynamaps.dto.DeskDTO;
import dynamaps.dto.FloorDTO;
import dynamaps.dto.PersonDTO;
import dynamaps.dto.ZoneDTO;
import dynamaps.model.configuration.Desk;
import dynamaps.model.configuration.Floor;
import dynamaps.model.configuration.Person;
import dynamaps.model.configuration.Zone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caldea on 3/26/2016.
 */
@Service
public class DynamapsTransformerImpl implements DynamapsTransformer {

    @Override
    public PersonDTO transform(Person person) {
        if (person != null) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setName(person.getName());
            personDTO.setEmail(person.getEmail());
            personDTO.setMac(person.getMac());
            personDTO.setDesk(transform(person.getDesk()));
            return personDTO;
        } else {
            return null;
        }
    }

    @Override
    public List<PersonDTO> toPersonDtoList(List<Person> person) {
        return null;
    }


    @Override
    public Person transform(PersonDTO personDTO){
        if (personDTO != null) {
            Person person = new Person();
            person.setMac(personDTO.getMac());
            person.setEmail(personDTO.getEmail());
            person.setName(personDTO.getName());
            person.setDesk(transform(personDTO.getDesk()));
            person.setId(personDTO.getId());
            return person;
        } else {
            return null;
        }
    }

    @Override
    public List<Person> toPersonEntityList(List<PersonDTO> personDTO) {
        return null;
    }


    @Override
    public FloorDTO transform(Floor floor){
        if (floor != null) {
            FloorDTO floorDTO = new FloorDTO();
            floorDTO.setName(floor.getName());
            floorDTO.setMap(floor.getMap());
            floorDTO.setId(floor.getId());
            return floorDTO;
        } else {
            return null;
        }
    }

    @Override
    public List<FloorDTO> toFloorDtoList(List<Floor> floors) {
        List<FloorDTO> floorDTOs= new ArrayList<>();
        for (Floor floor : floors) {
            floorDTOs.add(transform(floor));
        }

        return floorDTOs;
    }


    @Override
    public Floor transform(FloorDTO floorDTO){
        if (floorDTO != null) {
            Floor floor = new Floor(floorDTO.getName(), floorDTO.getMap());
            return floor;
        } else {
            return null;
        }
    }

    @Override
    public List<Floor> toFloorEntityList(List<FloorDTO> floorDTOs) {
        List<Floor> floors = new ArrayList<>();
        for (FloorDTO floorDTO : floorDTOs) {
            floors.add(transform(floorDTO));
        }
        return floors;
    }


    @Override
    public DeskDTO transform(Desk desk){
        if (desk != null) {
            DeskDTO deskDTO = new DeskDTO();
            deskDTO.setId(desk.getId());
            deskDTO.setCode(desk.getCode());
            deskDTO.setYlayout(desk.getYlayout());
            deskDTO.setXlayout(desk.getXlayout());
            deskDTO.setZone(transform(desk.getZone()));
            return deskDTO;
        } else {
            return null;
        }

    }

    @Override
    public List<DeskDTO> toDeskDtoList(List<Desk> desk) {
        return null;
    }


    @Override
    public Desk transform(DeskDTO deskDTO){
        if (deskDTO != null) {
            Desk desk = new Desk();
            desk.setId(deskDTO.getId());
            desk.setYlayout(deskDTO.getYlayout());
            desk.setXlayout(deskDTO.getXlayout());
            desk.setCode(deskDTO.getCode());
            desk.setZone(transform(deskDTO.getZone()));
            return desk;
        } else {
            return null;
        }
    }

    @Override
    public List<Desk> toDeskEntityList(List<DeskDTO> deskDTO) {
        return null;
    }


    @Override
    public ZoneDTO transform(Zone zone){
        if (zone != null) {
            ZoneDTO zoneDTO = new ZoneDTO();
            zoneDTO.setId(zone.getId());
            zoneDTO.setName(zone.getName());
            zoneDTO.setFloor(transform(zone.getFloor()));
            return zoneDTO;
        } else {
            return null;
        }
    }

    @Override
    public List<ZoneDTO> toZoneDtoList(List<Zone> zone) {
        return null;
    }


    @Override
    public Zone transform(ZoneDTO zoneDTO){
        if (zoneDTO != null) {
            Zone zone = new Zone();
            zone.setName(zoneDTO.getName());
            zone.setId(zoneDTO.getId());
            zone.setFloor(transform(zoneDTO.getFloor()));
            return zone;
        } else {
            return null;
        }
    }

    @Override
    public List<Zone> toZoneEntityList(List<ZoneDTO> zoneDTO) {
        return null;
    }


}