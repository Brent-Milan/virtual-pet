
WCCI
Week 2
Brent M.
Virtual Pet Project

In this game, you interact with a virtual pet. Specifically, a cute little rock golem named Jasper.
He isn't very cuddly, but he enjoys interacting with his master and he's passionate about mayhem. 

If you're having trouble imaging what a rock golem even looks like, here is a link to get you on the 
right track: https://i.ytimg.com/vi/HLjKDu8uVhA/maxresdefault.jpg  (source: Blizzard Entertainment)

The user is routinely updated on the golem's stats as the game loop plays out. The game loop is contingent
on the boolean isAlive() returning true -- which itself is contingent on Jasper's attributes not spiking
above int value 100. 

If his mood isn't managed properly, you might run into some problems giving him commands. 

There is also a leveling mechanic that I added in. The more loops that the virtual pet is kept alive, 
the higher the number climbs. I have some ideas for introducing more mechanics as the pet levels that I 
may add later on my own time. 

Devs Notes: 

I spent a lot of time tinkering with the tick() values and methods that modify the VirtualPet state.
I could spend quite a bit more to balance it out and add features, but it is in a playable state currently
that doesn't tend to 'RNG snowball' too often unless you spend a lot of time ignoring your pet. 

I had to ease up on using the tick() method in every instance, because that was feeding the attribute creep
a bit too much. (Ex. You would do something that had little or no meaningful impact, but the hunger/rage/etc
would jump up on you anyway). It wasn't fun to be painted into a corner every few turns as the whack-a-mole 
became unmanageable -- but it also isn't fun if the numbers don't occasionally have a little unpredictability. 

Added some variety in the switch statement as well. You may notice that if he isEnraged() and you ignore him,
there are some game-ending consequences. The pet also gets unruly or downtrodden depending on some boolean tests.
