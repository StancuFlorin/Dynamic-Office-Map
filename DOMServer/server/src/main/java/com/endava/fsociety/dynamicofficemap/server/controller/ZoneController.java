package com.endava.fsociety.dynamicofficemap.server.controller;

import com.endava.fsociety.dynamicofficemap.server.dto.ZoneDTO;
import com.endava.fsociety.dynamicofficemap.server.viewservice.ZoneViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fstancu on 5/11/2016.
 */

@RestController
@RequestMapping("/zone")
public class ZoneController {

    @Autowired
    private ZoneViewService zoneViewService;

    @RequestMapping(value = "/floor/{floorId}", method = RequestMethod.GET)
    public List<ZoneDTO> findByFloor(@PathVariable String floorId) {
        return zoneViewService.findByFloor(floorId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ZoneDTO save(@RequestBody ZoneDTO zoneDTO) {
        return zoneViewService.save(zoneDTO);
    }

}
