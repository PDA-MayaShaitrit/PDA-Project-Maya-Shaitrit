
//in order to do a random anything, do this:
//Random rand = new Random();
//int randomNumber = rand.nextInt(10); // 0-9
//end

package com.mrjaffesclass.apcs.mvc.template;
import com.mrjaffesclass.apcs.messenger.*;
/**
 * MVC Template
 * This is a template of an MVC framework used by APCS for the 
 * PDA project (and others)
 * @author Roger Jaffe
 * @version 1.0
 */
public class View extends javax.swing.JFrame implements MessageHandler {
  private final Messenger mvcMessaging;
  /**
   * Creates a new view
   * @param messages mvcMessaging object
   */
  public View(Messenger messages) {
    mvcMessaging = messages;   // Save the calling controller instance
    initComponents();           // Create and init the GUI components
  }
  /**
   * Initialize the model here and subscribe
   * to any required messages
   */
  public void init() {
    // Subscribe to messages here
    mvcMessaging.subscribe("model:lowerOfficial:view", this);
    mvcMessaging.subscribe("model:upperOfficial:view", this);
  }
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("RCV (view): "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("RCV (view): "+messageName+" | No data sent");
    }
    if (messageName.equals("model:variable1Changed")) {
      //jLabel1.setText(messagePayload.toString());
    } else {
      //jLabel2.setText(messagePayload.toString());      
    }
  }
  /**
   * Instantiate an object with the field number that was clicked (1 or 2) and
   * the direction that the number should go (up or down)
   * @param fieldNumber 1 or 2 for the field being modified
   * @param direction this.UP (1) or this.DOWN (-1), constants defined above
   * @return the HashMap payload to be sent with the message
   */
  private MessagePayload createPayload(int fieldNumber, int direction) {
    MessagePayload payload = new MessagePayload(fieldNumber, direction);
    return payload;
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        lastLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        age = new javax.swing.JPanel();
        ageLabel = new javax.swing.JLabel();
        ageNumber = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        firstAndLast = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        findAgeRange = new javax.swing.JButton();
        lowerBound = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        upperBound = new javax.swing.JLabel();
        doubleChecking = new javax.swing.JPanel();
        questionForDate = new javax.swing.JLabel();
        dateAge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        truth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstLabel.setText("First Name:");

        lastLabel.setText("Last Name:");

        javax.swing.GroupLayout nameLayout = new javax.swing.GroupLayout(name);
        name.setLayout(nameLayout);
        nameLayout.setHorizontalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstLabel)
                    .addComponent(lastLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastName)
                    .addComponent(firstName))
                .addContainerGap())
        );
        nameLayout.setVerticalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstLabel)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastLabel)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ageLabel.setText("How Old Are You?");

        javax.swing.GroupLayout ageLayout = new javax.swing.GroupLayout(age);
        age.setLayout(ageLayout);
        ageLayout.setHorizontalGroup(
            ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        ageLayout.setVerticalGroup(
            ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ageLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Yuppy SC", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(128, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Permissible Dating Age");
        title.setToolTipText("");

        firstAndLast.setEditable(false);
        firstAndLast.setText(" ");
        firstAndLast.setBorder(null);
        firstAndLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstAndLastActionPerformed(evt);
            }
        });

        resetButton.setText("Again!");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Tootles!");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        findAgeRange.setText("Click Me To Find Your Dating Age Range!");
        findAgeRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAgeRangeActionPerformed(evt);
            }
        });

        lowerBound.setText("          ");

        to.setText("          ");

        upperBound.setText("          ");

        questionForDate.setText("Hold Old Is The Lucky Person?");

        dateAge.setText(" ");

        jButton1.setText("Match?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        truth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        truth.setText(" ");

        javax.swing.GroupLayout doubleCheckingLayout = new javax.swing.GroupLayout(doubleChecking);
        doubleChecking.setLayout(doubleCheckingLayout);
        doubleCheckingLayout.setHorizontalGroup(
            doubleCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doubleCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doubleCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doubleCheckingLayout.createSequentialGroup()
                        .addComponent(questionForDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateAge))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(truth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        doubleCheckingLayout.setVerticalGroup(
            doubleCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doubleCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doubleCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionForDate)
                    .addComponent(dateAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(truth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(findAgeRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstAndLast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lowerBound)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(to)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upperBound))
                            .addComponent(doubleChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitButton, resetButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findAgeRange)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerBound)
                    .addComponent(to)
                    .addComponent(upperBound)
                    .addComponent(firstAndLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doubleChecking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(exitButton))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        firstName.setText(" ");
        lastName.setText(" ");
        ageNumber.setText(" ");
        firstAndLast.setText(" ");
        lowerBound.setText(" ");
        upperBound.setText(" ");
        to.setText(" ");
        dateAge.setText(" ");
        truth.setText(" ");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void findAgeRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findAgeRangeActionPerformed
        float ageAmount, lower, diff, upper;
        String yes, no, noWay, fullName, statement;
        ageAmount = Float.parseFloat(ageNumber.getText());
        lower = ageAmount/2 + 7;
        diff = ageAmount - lower;
        upper = ageAmount + diff;
        lowerBound.setText(String.valueOf(lower));
        upperBound.setText(String.valueOf(upper));
        to.setText(" to ");
        fullName = firstName.getText() + " " + lastName.getText();
        noWay = "You're not old enough for the dating world!";
        statement = fullName + ", your dating age range is:";
        if(ageAmount >= 14){
            firstAndLast.setText(statement);
        }
        else {
            firstAndLast.setText(noWay);
        }
    }//GEN-LAST:event_findAgeRangeActionPerformed

    private void firstAndLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstAndLastActionPerformed
        
    }//GEN-LAST:event_firstAndLastActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float dateAgeAmount, a, b;
        String yes, no, noWay;
        dateAgeAmount = Float.parseFloat(dateAge.getText());
        a = Float.parseFloat(upperBound.getText());
        b = Float.parseFloat(lowerBound.getText());
        yes = "This match works! Have fun";
        no = "Just a tad out of your range! Sorry bud.";
        noWay = "Let them grow up, they are just too young!";
        if(dateAgeAmount >= 14){
            if((dateAgeAmount <= a)&&(dateAgeAmount >= b))
                truth.setText(yes);
            else
                truth.setText(no);}
        else {
            truth.setText(noWay);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

  /**
   * @param args the command line arguments
   */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageNumber;
    private javax.swing.JTextField dateAge;
    private javax.swing.JPanel doubleChecking;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton findAgeRange;
    private javax.swing.JTextField firstAndLast;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lowerBound;
    private javax.swing.JPanel name;
    private javax.swing.JLabel questionForDate;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel to;
    private javax.swing.JLabel truth;
    private javax.swing.JLabel upperBound;
    // End of variables declaration//GEN-END:variables
}