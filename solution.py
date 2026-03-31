class Solution:
    def checkOnesSegment(self, s):
        init = True
        for n in s:
            if init and n == '0': init = False
            elif not init and n == '1': return False

        return True
