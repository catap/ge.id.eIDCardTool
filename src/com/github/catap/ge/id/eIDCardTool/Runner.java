package com.github.catap.ge.id.eIDCardTool;

import de.muehlbauer.easycapture.gui.common.components.panels.shell.BreadcrumbPanel;
import de.muehlbauer.easycapture.gui.common.components.panels.shell.ButtonsPanel;
import de.muehlbauer.easycapture.gui.common.components.panels.shell.FormPanel;
import de.muehlbauer.easycapture.gui.common.shell.EasyCaptureFrame;
import de.muehlbauer.easycapture.resources.ResourceManager;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) {
        ResourceManager.changeLocale("en", "US");
        System.out.println("asd");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EasyCaptureFrame.HEADER_PANEL_HEIGHT = 80;
                    EasyCaptureFrame.BUTTONS_PANEL_HEIGHT = 80;
                    EasyCaptureFrame.BREADCRUMB_PANEL_WIDTH = 225;
                    FormPanel.WIZARD_PANEL_HEIGHT = 0;
                    ButtonsPanel.BUTTON_WIDTH = 195;
                    ButtonsPanel.BUTTON_FONT = new Font("Sylfaen", 1, 14);
                    BreadcrumbPanel.BUTTON_FONT = new Font("Sylfaen", 0, 14);
                    EasyCaptureFrame e = new EasyCaptureFrame();
                    e.setLocationRelativeTo((Component)null);
                    e.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }
}