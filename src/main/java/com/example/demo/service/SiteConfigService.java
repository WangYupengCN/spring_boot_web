package com.example.demo.service;

import com.example.demo.dao.SiteConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteConfigService extends JpaRepository<SiteConfig, Long> {

}
