package main;

import win.Window;

import javax.swing.JOptionPane;

import nwork.*;

public class Overwatch {
	// INSTANCE VARIABLES
	private Window _w;
	private int _wins = 0;
	private int _losses = 0;
	private int _numGames = 0;
	private int _pointValue = 0;
	private int _newpointValue = 0;
	private int x;
	private boolean _alwaysTrue = true;
	private static final String[] CHOICE = { "Higher", "Lower", "I Quit" };
	private static final String[] YESNO = { "Yea why not", "I think I'll pass" };

	// CONSTRUCTOR
	public Overwatch() {
		_w = new Window();
		_w.msg("Terra Environmental Research Institute, a school that has had its ups and downs, as well as the school you call yours. You're \r\n"
				+ "a Junior taking 5 AP classes, and every day just seems to get more and more frustrating as you drown under your frustrations. \r\n"
				+ "Every step you take in school makes you wish you didn't decide to take so many APs, but you're here. You've even started to \r\n"
				+ "grow some grey hairs. You decide to visit your old teacher Mr. Rico from Engineering in Freshman year. \"Hey ma- oh shit what \r\n"
				+ "happened to you man?\" Rico says as you walk into one of his dreadful Freshman classes. You can barely get a word out before he \r\n"
				+ "tells you \"Here, I got something for you, it seems all this work has taken a couple years off your life, and I've got just the \r\n"
				+ "thing for you. My kids developed a VEX bot that can actually add years to your lifespan.. but only in the conditions of playing a \r\n"
				+ "card game. It's simple, guess whether or not the value of the next card in the deck it presents you will be higher or lower than the \r\n"
				+ "currently drawn card. Here, this kid's name is Trevor, he'll be your guide.\" Trevor looks at you and says, \"Sit down with me friend, \r\n"
				+ "this bot came from my home planet so it can do all sorts of crazy things, but for now we'll stick to life extension. Alright, let's go \r\n\"");
		int i = _w.option(YESNO,
				"Do you wanna see the robot? Some say if you look at the robot then you'll be scarred for life...");
		if (i == 0) {
			checkdeck();

			while (_alwaysTrue) {
				checkLoss();
				deal();

			}
		} else {
			while (_alwaysTrue) {
				checkLoss();
				deal();

			}
		}

	}

	/*
	 * This method will be used to check whether the player has lost
	 */
	public void checkLoss() {
		if (_losses == 3) {
			_w.msg("You've lost.. but you get to keep your extra years because you decided to sit through the whole game.");
			int i = _w.option(YESNO,
					"You can mess with time and rewind to try and get a couple more years... though that'll probably mess something up in the space-time continuum.");
			if (i == 0) {
				new Overwatch();
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}
	}

	/*
	 * This method is going to show every card in order
	 */
	public void checkdeck() {
		JOptionPane.showOptionDialog(null, null, "TrevorBot", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE,
				imag.God, null, null);

	}

	/*
	 * This method deals out all the cards and establishes what the results are
	 * going to be for each individual card
	 */
	public void deal() {
		int x = (int) (Math.random() * 52);
		if (x == 0) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twospade, CHOICE, CHOICE[0]); // ace
																												// spades
																												// at 39
			_pointValue = 2;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 1) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threespade, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 2) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourspade, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 3) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fivespade, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 4) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixspade, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 5) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenspade, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 6) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightspade, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 7) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.ninespade, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 8) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenspade, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 9) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jspade, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 10) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qspade, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 11) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kspade, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 12) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.aceheart, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 13) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twoheart, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 14) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threeheart, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 15) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourheart, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 16) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fiveheart, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 17) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixheart, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 18) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenheart, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 19) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightheart, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 20) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.nineheart, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 21) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenheart, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 22) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jheart, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 23) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qheart, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 24) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kheart, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 25) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.acediamond, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 26) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twodiamond, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 27) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threediamond, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 28) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourdiamond, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 29) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fivediamond, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 30) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixdiamond, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 31) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevendiamond, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 32) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightdiamond, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 33) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.ninediamond, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 34) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tendiamond, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 35) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jdiamond, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 36) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qdiamond, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 37) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kdiamond, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 38) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.aceclub, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 39) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.acespade, CHOICE, CHOICE[0]);
			_pointValue = 1;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 40) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.twoclub, CHOICE, CHOICE[0]);
			_pointValue = 2;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 41) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.threeclub, CHOICE, CHOICE[0]);
			_pointValue = 3;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 42) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fourclub, CHOICE, CHOICE[0]);
			_pointValue = 4;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 43) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.fiveclub, CHOICE, CHOICE[0]);
			_pointValue = 5;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 44) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sixclub, CHOICE, CHOICE[0]);
			_pointValue = 6;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 45) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.sevenclub, CHOICE, CHOICE[0]);
			_pointValue = 7;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 46) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.eightclub, CHOICE, CHOICE[0]);
			_pointValue = 8;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 47) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.nineclub, CHOICE, CHOICE[0]);
			_pointValue = 9;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 48) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.tenclub, CHOICE, CHOICE[0]);
			_pointValue = 10;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 49) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Jclub, CHOICE, CHOICE[0]);
			_pointValue = 11;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		} else if (x == 50) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Qclub, CHOICE, CHOICE[0]);
			_pointValue = 12;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}

		else if (x == 51) {
			int y = JOptionPane.showOptionDialog(null,
					"You've added " + _wins + " years to your life span. \r\n" + "However... you've gotten " + _losses
							+ " wrong " + "out of " + _numGames + " attempts, watch your losses friend.",
					"Is the next in line higher or lower than the current one? Your life depends on it.",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, imag.Kclub, CHOICE, CHOICE[0]);
			_pointValue = 13;
			if (y == 0) {
				_newpointValue = (int) (1 + Math.random() * 13);
				_numGames++;
				if (_pointValue > _newpointValue) {

					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else if (y == 1) {
				_numGames++;
				if (_pointValue < _newpointValue) {
					_losses++;
					_w.msg("That's one more into the loss bin my friend");
				} else {
					_wins++;
					_w.msg("Lucky for you, that's another correct! Another year of life for you!");
				}
			} else {
				_w.msg("Leaving preemptively shortens your life span rather than add to it with your wins you know... well so be it, be on your way now.");
				System.exit(0);
			}
		}
	}
}
