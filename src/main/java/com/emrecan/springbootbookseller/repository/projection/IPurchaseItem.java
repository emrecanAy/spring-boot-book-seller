package com.emrecan.springbootbookseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @author Emrecan
 * @created 31/10/2021 - 23:38
 */
public interface IPurchaseItem {

    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();

}
