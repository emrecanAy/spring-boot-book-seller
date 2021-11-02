package com.emrecan.springbootbookseller.service;

import com.emrecan.springbootbookseller.model.PurchaseHistory;
import com.emrecan.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.emrecan.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Emrecan
 * @created 01/11/2021 - 00:38
 */

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId){
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }

}
