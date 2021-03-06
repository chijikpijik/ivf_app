/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cf.card.ui.service.printing.templates;

import org.cf.card.ui.model.UIClient;
import org.cf.card.ui.model.UIPrintClient;
import org.cf.card.ui.service.UIClipartService;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * @author Dell
 */
public class fileTemplate extends JPanel {

    private final UIClipartService clipartService = new UIClipartService();

    /**
     * Creates new form fileTemplate
     */


    public fileTemplate(UIPrintClient client) {

        initComponents();

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(clipartService.getImage(client.getMainClient().getCouple().getId())));
        } catch (IOException e) {
            e.printStackTrace();

        }

        Image dimg = img.getScaledInstance(268, 388,
                Image.SCALE_SMOOTH);

        ImageIcon imageIcon = new ImageIcon(dimg);
        designLabel.setIcon(imageIcon);

        UIClient woman = new UIClient(client.getMainClient());
        UIClient partner = new UIClient(client.getPartner());


        womanSurname.setText(woman.getClient().getSurname().toUpperCase());
        try {
            womanOtherNames.setText(woman.getClient().getFirstName() + " " + woman.getClient().getMiddleName());
        } catch (StringIndexOutOfBoundsException e) {
            womanOtherNames.setText(woman.getClient().getFirstName());
        }
        womanDateLabel.setText(new SimpleDateFormat("dd/MM/yyyy").format(woman.getClient().getdOB()));
        womanAgeLabel.setText(woman.getAge());
        WomanCodeLabel.setText("" + client.getMainClientTreatmentCode().getCode());
       // WomanSecondAlphanumericCharacter.setText("" + client.getMainClientTreatmentCode().getCode().charAt(1));
      //  WomanThirdAlphanumericCharacter.setText("" + client.getMainClientTreatmentCode().getCode().charAt(2));


        partnerSurname.setText(partner.getClient().getSurname().toUpperCase());
        try {
            partnerOtherNames.setText(partner.getClient().getFirstName() + " " + partner.getClient().getMiddleName());
        } catch (StringIndexOutOfBoundsException e) {
            partnerOtherNames.setText(partner.getClient().getFirstName());
        }
        partnerDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(partner.getClient().getdOB()));
        partnerAge.setText(partner.getAge());
        partnerCodeLabel.setText("" + client.getPartnerTreatmentCode().getCode());
        //partnerSecondAlphanumericCharacter.setText("" + client.getPartnerTreatmentCode().getCode().charAt(1));
       // partnerThirdAlphanumericCharacter.setText("" + client.getPartnerTreatmentCode().getCode().charAt(2));

        Calendar c = Calendar.getInstance();
        c.setTime(client.getMainClientTreatmentCode().getTreatment().getStartDate());
        c.add(Calendar.DATE, 1);
        dateLabel.setText("(Date) " + new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));


//        WomanFirstAlphanumericCharacter.setVisible(false);
//        WomanSecondAlphanumericCharacter.setVisible(false);
//        WomanThirdAlphanumericCharacter.setVisible(false);
//        dateLabel.setVisible(false);
//        designLabel.setVisible(false);
//        jLabel14.setVisible(false);
//        jLabel16.setVisible(false);
//        jLabel18.setVisible(false);
//        jLabel2.setVisible(false);
//        jLabel20.setVisible(false);
//        jLabel3.setVisible(false);
//        jLabel5.setVisible(false);
//        jLabel7.setVisible(false);
//        jLabel9.setVisible(false);
//        partnerAge.setVisible(false);
//        partnerDate.setVisible(false);
//        partnerFirstAlphanumericCharacter.setVisible(false);
//        partnerOtherNames.setVisible(false);
//        partnerSecondAlphanumericCharacter.setVisible(false);
//        partnerSurname.setVisible(false);
//        partnerThirdAlphanumericCharacter.setVisible(false);
//        womanAgeLabel.setVisible(false);
//        womanDateLabel.setVisible(false);
//        womanJlabel.setVisible(false);
//        womanOtherNames.setVisible(false);
//        womanSurname.setVisible(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        designLabel = new JLabel();
        designLabel.setMinimumSize(new Dimension(64, 38));
        designLabel.setMaximumSize(new Dimension(64, 38));
        womanJlabel = new JLabel();
        jLabel2 = new JLabel();
        womanSurname = new JLabel();
        jLabel3 = new JLabel();
        womanOtherNames = new JLabel();
        jLabel5 = new JLabel();
        womanDateLabel = new JLabel();
        jLabel7 = new JLabel();
        womanAgeLabel = new JLabel();
        jLabel9 = new JLabel();
        WomanCodeLabel = new JLabel();
        partnerSurname = new JLabel();
        jLabel14 = new JLabel();
        partnerOtherNames = new JLabel();
        jLabel16 = new JLabel();
        partnerDate = new JLabel();
        jLabel18 = new JLabel();
        partnerAge = new JLabel();
        jLabel20 = new JLabel();
        partnerCodeLabel = new JLabel();
        dateLabel = new JLabel();

        setBackground(new Color(255, 255, 255));
        setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        setMaximumSize(new Dimension(687, 400));
        setMinimumSize(new Dimension(687, 400));
        setPreferredSize(new Dimension(687, 400));

        designLabel.setPreferredSize(new Dimension(64, 38));

        womanJlabel.setFont(new Font("Open Sans", Font.PLAIN, 16)); // NOI18N
        womanJlabel.setHorizontalAlignment(SwingConstants.CENTER);
        womanJlabel.setText("<HTML>W<br>O<br>M<br>A<br>N</HTML>"); // NOI18N
        womanJlabel.setToolTipText("");
        womanJlabel.setVerticalAlignment(SwingConstants.TOP);
        womanJlabel.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
        womanJlabel.setHorizontalTextPosition(SwingConstants.CENTER);

        jLabel2.setFont(new Font("Open Sans", Font.PLAIN, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("<HTML>P<br>A<br>R<br>T<br>N<br>E<br>R</HTML>");
        jLabel2.setVerticalAlignment(SwingConstants.TOP);

        womanSurname.setFont(new Font("Open Sans", Font.BOLD, 30)); // NOI18N
        womanSurname.setHorizontalAlignment(SwingConstants.CENTER);
        womanSurname.setText("ALEXANDER");
        womanSurname.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        womanSurname.setIconTextGap(6);

        jLabel3.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Surname");

        womanOtherNames.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 26)); // NOI18N
        womanOtherNames.setHorizontalAlignment(SwingConstants.CENTER);
        womanOtherNames.setText("Freeman R.");
        womanOtherNames.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        womanOtherNames.setIconTextGap(6);

        jLabel5.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Other Names");

        womanDateLabel.setFont(new Font("Open Sans", Font.PLAIN, 22)); // NOI18N
        womanDateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        womanDateLabel.setText("22/01/94");
        womanDateLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        womanDateLabel.setIconTextGap(6);

        jLabel7.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("D.O.B.");

        womanAgeLabel.setFont(new Font("Open Sans", Font.PLAIN, 22)); // NOI18N
        womanAgeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        womanAgeLabel.setText("20");
        womanAgeLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        womanAgeLabel.setIconTextGap(6);

        jLabel9.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Age\n");

        WomanCodeLabel.setFont(new Font("Open Sans", Font.BOLD, 46)); // NOI18N
        WomanCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        WomanCodeLabel.setText("G");
        WomanCodeLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        partnerSurname.setFont(new Font("Open Sans", Font.BOLD, 30)); // NOI18N
        partnerSurname.setHorizontalAlignment(SwingConstants.CENTER);
        partnerSurname.setText("GORBERCHEV");
        partnerSurname.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        partnerSurname.setIconTextGap(6);

        jLabel14.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel14.setText("Surname");

        partnerOtherNames.setFont(new Font("Open Sans", 3, 30)); // NOI18N
        partnerOtherNames.setHorizontalAlignment(SwingConstants.CENTER);
        partnerOtherNames.setText("Landley");
        partnerOtherNames.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        partnerOtherNames.setIconTextGap(6);

        jLabel16.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setText("Other Names");

        partnerDate.setFont(new Font("Open Sans", Font.PLAIN, 22)); // NOI18N
        partnerDate.setHorizontalAlignment(SwingConstants.CENTER);
        partnerDate.setText("22/01/94");
        partnerDate.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        partnerDate.setIconTextGap(6);

        jLabel18.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel18.setText("D.O.B.");

        partnerAge.setFont(new Font("Open Sans", Font.PLAIN, 22)); // NOI18N
        partnerAge.setHorizontalAlignment(SwingConstants.CENTER);
        partnerAge.setText("20");
        partnerAge.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, new Color(204, 204, 204)));
        partnerAge.setIconTextGap(6);

        jLabel20.setFont(new Font("Open Sans", Font.ITALIC, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel20.setText("Age\n");

        partnerCodeLabel.setFont(new Font("Open Sans", Font.BOLD, 46)); // NOI18N
        partnerCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        partnerCodeLabel.setText("X");
        partnerCodeLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        dateLabel.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 12)); // NOI18N
        dateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        dateLabel.setText("(Date) 12/01/2015");

        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(4)
        			.addComponent(designLabel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(263)
        					.addComponent(dateLabel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(womanSurname, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(womanOtherNames, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jLabel7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(womanDateLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
        									.addGap(8)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jLabel9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(womanAgeLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
        								.addComponent(partnerSurname, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addComponent(partnerOtherNames, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addComponent(jLabel16, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addComponent(WomanCodeLabel, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jLabel18, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(partnerDate, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
        									.addGap(8)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jLabel20, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(partnerAge, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
        								.addComponent(partnerCodeLabel, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        							.addGap(14)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
        								.addComponent(womanJlabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(dateLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(womanSurname, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(womanOtherNames, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(womanDateLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        							.addGap(0)
        							.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(womanAgeLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        							.addGap(0)
        							.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
        					.addGap(1)
        					.addComponent(WomanCodeLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(partnerSurname, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(partnerOtherNames, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(0)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(partnerDate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        							.addGap(0)
        							.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(partnerAge, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        							.addGap(0)
        							.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)))
        					.addGap(1)
        					.addComponent(partnerCodeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(womanJlabel)
        					.addGap(11)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
        			.addGap(6))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(designLabel, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel WomanCodeLabel;
    private JLabel dateLabel;
    private JLabel designLabel;
    private JLabel jLabel14;
    private JLabel jLabel16;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JLabel partnerAge;
    private JLabel partnerDate;
    private JLabel partnerCodeLabel;
    private JLabel partnerOtherNames;
    private JLabel partnerSurname;
    private JLabel womanAgeLabel;
    private JLabel womanDateLabel;
    private JLabel womanJlabel;
    private JLabel womanOtherNames;
    private JLabel womanSurname;
    // End of variables declaration//GEN-END:variables
}
