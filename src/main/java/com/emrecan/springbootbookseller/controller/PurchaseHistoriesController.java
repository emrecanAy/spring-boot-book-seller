package com.emrecan.springbootbookseller.controller;

import com.emrecan.springbootbookseller.model.PurchaseHistory;
import com.emrecan.springbootbookseller.security.UserPrincipal;
import com.emrecan.springbootbookseller.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @author Emrecan
 * @created 06/11/2021 - 02:00
 */

@RestController
@RequestMapping("api/purchase-histories") //pre-path
public class PurchaseHistoriesController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping //api/purchase-histories
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory){
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.OK);
    }

    @GetMapping //api/purchase-histories
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal){
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
    }


}
