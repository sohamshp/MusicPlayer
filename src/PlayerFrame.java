
import java.io.File;
import javafx.scene.media.*;
import javafx.util.Duration;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Soham & Yashesh
 */
public class PlayerFrame extends javax.swing.JFrame implements PlayControl, SoundControl{

    private MediaPlayer mediaPlayer;
    private Media media;
    private String []playlist = new String[1000];
    private int playlistCount = 0;
    private int playlistPos = 0 ;
    private boolean isPlaying ;
    private double vol ;
    private boolean isMute = false ;
    private double playSpeed = 1; 
    TSlider t1 = new TSlider();    
    
    String playFile = "play.png";
    String pauseFile = "pause.png";
    String stopFile = "stop.png";
    String muteFile = "mute.png";
    String volFile = "media-volume.png";
        
    ImageIcon playIcon = new ImageIcon(getClass().getResource(playFile));
    ImageIcon pauseIcon = new ImageIcon(getClass().getResource(pauseFile));
    ImageIcon stopIcon = new ImageIcon(getClass().getResource(stopFile));
    ImageIcon muteIcon = new ImageIcon(getClass().getResource(muteFile));
    ImageIcon unmuteIcon = new ImageIcon(getClass().getResource(volFile));

    /**
     * Creates new form PlayerFrame
     */
    public PlayerFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        PlayButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        TimeSlider = new javax.swing.JSlider();
        TimeLabel = new javax.swing.JLabel();
        VolSlider = new javax.swing.JSlider();
        MuteButton = new javax.swing.JButton();
        FastButton = new javax.swing.JButton();
        SlowButton = new javax.swing.JButton();
        MediaInfoLabel = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpenFileMenuItem = new javax.swing.JMenuItem();
        MultiOpenButton = new javax.swing.JMenuItem();
        Quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NextMenuItem = new javax.swing.JMenuItem();
        PrevMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        SpeedMenu = new javax.swing.JMenu();
        FastFine = new javax.swing.JMenuItem();
        Normal = new javax.swing.JMenuItem();
        SlowFine = new javax.swing.JMenuItem();
        PlayMenuItem = new javax.swing.JMenuItem();
        StopMenuItem = new javax.swing.JMenuItem();
        MuteMenuItem = new javax.swing.JMenuItem();
        SeekMenu = new javax.swing.JMenu();
        forward4sec = new javax.swing.JMenuItem();
        forward10sec = new javax.swing.JMenuItem();
        forward1min = new javax.swing.JMenuItem();
        backward1min = new javax.swing.JMenuItem();
        backward10sec = new javax.swing.JMenuItem();
        backward4sec = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        PlayButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PlayButton.setMaximumSize(new java.awt.Dimension(30, 33));
        PlayButton.setMinimumSize(new java.awt.Dimension(30, 33));
        PlayButton.setPreferredSize(new java.awt.Dimension(30, 33));
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        StopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stop.png"))); // NOI18N
        StopButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        StopButton.setPreferredSize(new java.awt.Dimension(53, 23));
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        TimeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TimeSliderStateChanged(evt);
            }
        });
        TimeSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TimeSliderMouseDragged(evt);
            }
        });
        TimeSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimeSliderMouseClicked(evt);
            }
        });
        TimeSlider.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                TimeSliderCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        TimeSlider.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TimeSliderPropertyChange(evt);
            }
        });

        TimeLabel.setToolTipText("");
        TimeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        VolSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VolSliderStateChanged(evt);
            }
        });

        MuteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media-volume.png"))); // NOI18N
        MuteButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MuteButton.setMaximumSize(new java.awt.Dimension(53, 23));
        MuteButton.setMinimumSize(new java.awt.Dimension(53, 23));
        MuteButton.setPreferredSize(new java.awt.Dimension(53, 23));
        MuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuteButtonActionPerformed(evt);
            }
        });

        FastButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fast_speed.png"))); // NOI18N
        FastButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastButtonActionPerformed(evt);
            }
        });

        SlowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slow_speed.png"))); // NOI18N
        SlowButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SlowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlowButtonActionPerformed(evt);
            }
        });

        MediaInfoLabel.setText("--");

        imgLabel.setIconTextGap(0);
        imgLabel.setOpaque(true);

        jMenu1.setText("File");

        OpenFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenFileMenuItem.setText("Open file");
        OpenFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(OpenFileMenuItem);

        MultiOpenButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MultiOpenButton.setText("Open Multiple Files");
        MultiOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiOpenButtonActionPerformed(evt);
            }
        });
        jMenu1.add(MultiOpenButton);

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        jMenu1.add(Quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        NextMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_DOWN, 0));
        NextMenuItem.setText("Next");
        NextMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(NextMenuItem);

        PrevMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_UP, 0));
        PrevMenuItem.setText("Previous");
        PrevMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(PrevMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Playback");

        SpeedMenu.setText("Speed");

        FastFine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        FastFine.setText("Fast Fine");
        FastFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastFineActionPerformed(evt);
            }
        });
        SpeedMenu.add(FastFine);

        Normal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Normal.setText("Normal");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        SpeedMenu.add(Normal);

        SlowFine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SlowFine.setText("Slow Fine");
        SlowFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlowFineActionPerformed(evt);
            }
        });
        SpeedMenu.add(SlowFine);

        jMenu3.add(SpeedMenu);

        PlayMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        PlayMenuItem.setText(" Play");
        PlayMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(PlayMenuItem);

        StopMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        StopMenuItem.setText("Stop");
        StopMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(StopMenuItem);

        MuteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        MuteMenuItem.setText("Mute");
        MuteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuteMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(MuteMenuItem);

        SeekMenu.setText("Seek");

        forward4sec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.SHIFT_MASK));
        forward4sec.setText("4sec forward");
        forward4sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward4secActionPerformed(evt);
            }
        });
        SeekMenu.add(forward4sec);

        forward10sec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.ALT_MASK));
        forward10sec.setText("10sec forward");
        forward10sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward10secActionPerformed(evt);
            }
        });
        SeekMenu.add(forward10sec);

        forward1min.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.CTRL_MASK));
        forward1min.setText("1min forward");
        forward1min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward1minActionPerformed(evt);
            }
        });
        SeekMenu.add(forward1min);

        backward1min.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.CTRL_MASK));
        backward1min.setText("1min backward");
        backward1min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backward1minActionPerformed(evt);
            }
        });
        SeekMenu.add(backward1min);

        backward10sec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.ALT_MASK));
        backward10sec.setText("10sec backward");
        backward10sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backward10secActionPerformed(evt);
            }
        });
        SeekMenu.add(backward10sec);

        backward4sec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.SHIFT_MASK));
        backward4sec.setText("4sec backward");
        backward4sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backward4secActionPerformed(evt);
            }
        });
        SeekMenu.add(backward4sec);

        jMenu3.add(SeekMenu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SlowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MediaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MuteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VolSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TimeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VolSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MuteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MediaInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileMenuItemActionPerformed
        if (media != null){
            try {
                t1.timerThread.wait();
            } catch(Exception e){
                System.out.println("Exception : "+e);
            }
        }
        TimeSlider.setValue(0);
        try {
            getFile(evt);
            System.out.println(playlist[playlistPos]+"1");
            if (media==null){
                loadFile();
            }
        } catch (NullPointerException n){
            System.out.println("Exception : File Not Selected!!!");
            
        } catch(MediaException m) {
            System.out.println("Exception : Unsupported File Type selected!!!");
            OpenFileMenuItemActionPerformed(evt);
        } catch(Exception e){
            System.out.print("Exception : "+e);
        }
    }//GEN-LAST:event_OpenFileMenuItemActionPerformed
    
    private void getFile(java.awt.event.ActionEvent evt){
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        playlist[playlistCount++] = file.getAbsolutePath();
        playlist[playlistPos] = playlist[playlistPos].replace("\\", "/");
    }
    
    private void loadFile() {
        try {
            media = new Media(new File(playlist[0]).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(false);
        } catch (Exception e){
            System.out.println("Exception : "+e);
        }
        isPlaying = false ;
        MediaInfoLabel.setText(media.getMetadata().get("title")+" - "+media.getMetadata().get("artist"));
        
        TimeLabel.setText(TimeFormat((int)mediaPlayer.getCurrentTime().toSeconds())+"/"+TimeFormat((int)mediaPlayer.getMedia().getDuration().toSeconds()));
        TimeSlider.setMaximum((int) mediaPlayer.getMedia().getDuration().toSeconds());
        TimeSlider.setMinimum(0);
    }
    
    private void getFiles(java.awt.event.ActionEvent evt){
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null);
        File []file = chooser.getSelectedFiles();
        for (int i=0; i<file.length; i++, playlistCount++ ){
            playlist[playlistCount] = file[i].getAbsolutePath();
            playlist[playlistCount] = playlist[playlistCount].replace("\\", "/");
        }
        TimeSlider.setValue(0);
        if (media == null){
            loadFile();
        }
    }
    
    
    
    
    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        if (isPlaying == false ){
                play();
                isPlaying = true ;
                PlayMenuItem.setText("Pause");
                PlayButton.setIcon(pauseIcon);
        }
        else {
                pause();
                isPlaying = false;
                PlayMenuItem.setText("Play");
                PlayButton.setIcon(playIcon);
        }
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        isPlaying = false ;
        stop();
        PlayMenuItem.setText("Play");
        PlayButton.setIcon(playIcon);
    }//GEN-LAST:event_StopButtonActionPerformed

    private void VolSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VolSliderStateChanged
        double vol = VolSlider.getValue()/100.0;
        mediaPlayer.setVolume(vol);
    }//GEN-LAST:event_VolSliderStateChanged

    private void TimeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TimeSliderStateChanged
    }//GEN-LAST:event_TimeSliderStateChanged

    private void TimeSliderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TimeSliderPropertyChange
    }//GEN-LAST:event_TimeSliderPropertyChange

    private void TimeSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeSliderMouseClicked
    }//GEN-LAST:event_TimeSliderMouseClicked

    private void TimeSliderCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TimeSliderCaretPositionChanged
    }//GEN-LAST:event_TimeSliderCaretPositionChanged

    private void TimeSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeSliderMouseDragged
    }//GEN-LAST:event_TimeSliderMouseDragged

    private void MuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuteButtonActionPerformed
        if (isMute == false) {
            muteSound();
            isMute = true ;
            MuteButton.setIcon(muteIcon);
        }
        else {
            unMuteSound();
            isMute = false ;
            MuteButton.setIcon(unmuteIcon);
        }
    }//GEN-LAST:event_MuteButtonActionPerformed

    private void StopMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopMenuItemActionPerformed
        StopButtonActionPerformed(evt);
    }//GEN-LAST:event_StopMenuItemActionPerformed

    private void PlayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayMenuItemActionPerformed
        PlayButtonActionPerformed(evt);
    }//GEN-LAST:event_PlayMenuItemActionPerformed

    private void MuteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuteMenuItemActionPerformed
        MuteButtonActionPerformed(evt);
    }//GEN-LAST:event_MuteMenuItemActionPerformed

    private void FastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastButtonActionPerformed
        if (playSpeed < 8){
            playSpeed *= 2 ;
            mediaPlayer.setRate(playSpeed);
        }
        else {
            playSpeed = 1;
            mediaPlayer.setRate(playSpeed);
        }
    }//GEN-LAST:event_FastButtonActionPerformed

    private void SlowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlowButtonActionPerformed
        if (playSpeed > 0.125) {
            playSpeed /= 2 ;
            mediaPlayer.setRate(playSpeed);
        }
        else {
            playSpeed = 1;
            mediaPlayer.setRate(playSpeed);
        }
    }//GEN-LAST:event_SlowButtonActionPerformed

    private void FastFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastFineActionPerformed
        FastButtonActionPerformed(evt);
    }//GEN-LAST:event_FastFineActionPerformed

    private void SlowFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlowFineActionPerformed
        SlowButtonActionPerformed(evt);
    }//GEN-LAST:event_SlowFineActionPerformed

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        mediaPlayer.setRate(1);
    }//GEN-LAST:event_NormalActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void forward4secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward4secActionPerformed
        Duration dur = new Duration((long) 4000);
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(dur));
        updateTime();
    }//GEN-LAST:event_forward4secActionPerformed

    private void forward1minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward1minActionPerformed
        Duration dur = new Duration((long) 60000);
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(dur));
        updateTime();
    }//GEN-LAST:event_forward1minActionPerformed

    private void forward10secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward10secActionPerformed
        Duration dur = new Duration((long) 10000);
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(dur));
        updateTime();
    }//GEN-LAST:event_forward10secActionPerformed

    private void backward1minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backward1minActionPerformed
        Duration dur = new Duration((long) 60000);
        if ( mediaPlayer.getCurrentTime().subtract(dur).lessThan(new Duration((long)0))){
            mediaPlayer.seek(new Duration((long)0));
        }
        mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(dur));
        updateTime();
    }//GEN-LAST:event_backward1minActionPerformed

    private void backward10secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backward10secActionPerformed
        Duration dur = new Duration((long) 10000);
        if ( mediaPlayer.getCurrentTime().subtract(dur).lessThan(new Duration((long)0))){
            mediaPlayer.seek(new Duration((long)0));
        }
        mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(dur));
        updateTime();
    }//GEN-LAST:event_backward10secActionPerformed

    private void backward4secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backward4secActionPerformed
        Duration dur = new Duration((long) 4000);
        if ( mediaPlayer.getCurrentTime().subtract(dur).lessThan(new Duration((long)0))){
            mediaPlayer.seek(new Duration((long)0));
        }
        mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(dur));
        updateTime();
    }//GEN-LAST:event_backward4secActionPerformed

    private void MultiOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiOpenButtonActionPerformed
        getFiles(evt);
    }//GEN-LAST:event_MultiOpenButtonActionPerformed

    private void NextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMenuItemActionPerformed
        
        
        if (playlistPos==playlistCount-1){
            System.out.println("This is last file!");
        }
        else {
            StopButtonActionPerformed(evt);
            try {
                t1.timerThread.wait();
            } catch(Exception e){
                ;
            }
            String path = playlist[playlistPos+1];
            playlistPos++ ;
            try {
                media = new Media((new File(path).toURI().toString()));
                mediaPlayer = new MediaPlayer(media);
            } catch (Exception e){
                System.out.println("Exception : "+e);
            }
            MediaInfoLabel.setText(media.getMetadata().get("title")+" - "+media.getMetadata().get("artist"));
            TimeLabel.setText(TimeFormat((int)mediaPlayer.getCurrentTime().toSeconds())+"/"+TimeFormat((int)mediaPlayer.getMedia().getDuration().toSeconds()));
            TimeSlider.setMaximum((int) mediaPlayer.getMedia().getDuration().toSeconds());
            TimeSlider.setMinimum(0); 
        }
    }//GEN-LAST:event_NextMenuItemActionPerformed

    private void PrevMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevMenuItemActionPerformed
        
        if (playlistPos>0){
            StopButtonActionPerformed(evt);
            try {
                t1.timerThread.wait();
            } catch(Exception e){
                ;
            }   
            String path = playlist[playlistPos-1];
            playlistPos-- ;
            try {
                media = new Media((new File(path).toURI().toString()));
                mediaPlayer = new MediaPlayer(media);
            } catch (MediaException e){
                System.out.println("Exception : "+e);
            } catch (Exception e){
                System.out.println("Exception : "+e);
            }
            
            MediaInfoLabel.setText(media.getMetadata().get("title")+" - "+media.getMetadata().get("artist"));
            TimeLabel.setText(TimeFormat((int)mediaPlayer.getCurrentTime().toSeconds())+"/"+TimeFormat((int)mediaPlayer.getMedia().getDuration().toSeconds()));
            TimeSlider.setMaximum((int) mediaPlayer.getMedia().getDuration().toSeconds());
            TimeSlider.setMinimum(0);
        }
        else {
            System.out.println("This is the first file!");
        }
    }//GEN-LAST:event_PrevMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FastButton;
    private javax.swing.JMenuItem FastFine;
    private javax.swing.JLabel MediaInfoLabel;
    private javax.swing.JMenuItem MultiOpenButton;
    private javax.swing.JButton MuteButton;
    private javax.swing.JMenuItem MuteMenuItem;
    private javax.swing.JMenuItem NextMenuItem;
    private javax.swing.JMenuItem Normal;
    private javax.swing.JMenuItem OpenFileMenuItem;
    private javax.swing.JButton PlayButton;
    private javax.swing.JMenuItem PlayMenuItem;
    private javax.swing.JMenuItem PrevMenuItem;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JMenu SeekMenu;
    private javax.swing.JButton SlowButton;
    private javax.swing.JMenuItem SlowFine;
    private javax.swing.JMenu SpeedMenu;
    private javax.swing.JButton StopButton;
    private javax.swing.JMenuItem StopMenuItem;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JSlider TimeSlider;
    private javax.swing.JSlider VolSlider;
    private javax.swing.JMenuItem backward10sec;
    private javax.swing.JMenuItem backward1min;
    private javax.swing.JMenuItem backward4sec;
    private javax.swing.JMenuItem forward10sec;
    private javax.swing.JMenuItem forward1min;
    private javax.swing.JMenuItem forward4sec;
    public javax.swing.JLabel imgLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void muteSound() {
        vol = mediaPlayer.getVolume();
        VolSlider.setValue(0);
    }
    
    @Override
    public void unMuteSound() {
        VolSlider.setValue((int)(vol*100));
    }

    @Override
    public void play() {
        mediaPlayer.play();
        try {    
            t1.timerThread.start();
            t1.timerThread.notify();
        } catch (Exception e){
            ;
        }
        MediaInfoLabel.setText(media.getMetadata().get("title")+" - "+media.getMetadata().get("artist"));
        
        TimeLabel.setText(TimeFormat((int)mediaPlayer.getCurrentTime().toSeconds())+"/"+TimeFormat((int)mediaPlayer.getMedia().getDuration().toSeconds()));
        TimeSlider.setMaximum((int) mediaPlayer.getMedia().getDuration().toSeconds());
        TimeSlider.setMinimum(0);
    }

    @Override
    public void pause() {
        mediaPlayer.pause();
    }

    @Override
    public void stop() {
        mediaPlayer.stop();
    }

    public void updateTime(){
        TimeSlider.setValue((int)mediaPlayer.getCurrentTime().toSeconds());
        TimeLabel.setText(TimeFormat((int)mediaPlayer.getCurrentTime().toSeconds())+"/"+TimeFormat((int)mediaPlayer.getMedia().getDuration().toSeconds()));
    }

    public String TimeFormat(int sec){
        int min = sec/60;
        sec = sec%60;
        return min+":"+sec;
    }
    
    class TSlider implements Runnable {               
        Thread timerThread ;
        TSlider() {
            timerThread = new Thread(this, "timerThread");
        }
        public void run(){
            while(true){
                updateTime();
                MediaInfoLabel.setText(media.getMetadata().get("title")+" - "+media.getMetadata().get("artist"));
            }
        }
    }
}